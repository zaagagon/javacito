<?php
require_once __DIR__ . '/conexion.php';

$tipos = ['Periférico', 'Almacenamiento', 'Hardware', 'Software', 'Otro'];
$mensaje = $_GET['mensaje'] ?? '';
$idEditar = filter_input(INPUT_GET, 'editar', FILTER_VALIDATE_INT);
$productoEditar = null;

if ($idEditar) {
    $consultaEditar = $conexion->prepare('SELECT * FROM productos WHERE id_producto = :id_producto');
    $consultaEditar->execute([':id_producto' => $idEditar]);
    $productoEditar = $consultaEditar->fetch();
}

$consulta = $conexion->query('SELECT * FROM productos ORDER BY id_producto DESC');
$productos = $consulta->fetchAll();

function e(string $valor): string
{
    return htmlspecialchars($valor, ENT_QUOTES, 'UTF-8');
}
?>
<!doctype html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CRUD Productos - Tecnoia</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <main class="contenedor">
        <header class="encabezado">
            <div>
                <p class="etiqueta">Base de datos Tecnoia</p>
                <h1>CRUD de productos</h1>
                <p>Visualiza, inserta, edita y elimina registros de la tabla <strong>productos</strong>.</p>
            </div>
        </header>

        <?php if ($mensaje): ?>
            <div class="alerta">
                <?php
                $mensajes = [
                    'creado' => 'Producto creado correctamente.',
                    'actualizado' => 'Producto actualizado correctamente.',
                    'eliminado' => 'Producto eliminado correctamente.',
                    'datos_invalidos' => 'Revisa los datos ingresados.',
                    'id_invalido' => 'No se encontró el producto solicitado.',
                ];
                echo e($mensajes[$mensaje] ?? 'Operación finalizada.');
                ?>
            </div>
        <?php endif; ?>

        <section class="tarjeta">
            <h2><?= $productoEditar ? 'Editar producto' : 'Insertar producto' ?></h2>
            <form action="guardar.php" method="post" class="formulario">
                <?php if ($productoEditar): ?>
                    <input type="hidden" name="id_producto" value="<?= e((string) $productoEditar['id_producto']) ?>">
                <?php endif; ?>

                <label>
                    Nombre producto
                    <input type="text" name="nombre_producto" required maxlength="120" value="<?= e($productoEditar['nombre_producto'] ?? '') ?>">
                </label>

                <label>
                    Precio
                    <input type="number" name="precio" required min="0" step="0.01" value="<?= e((string) ($productoEditar['precio'] ?? '')) ?>">
                </label>

                <label>
                    Tipo
                    <select name="tipo" required>
                        <option value="">Seleccione un tipo</option>
                        <?php foreach ($tipos as $tipo): ?>
                            <option value="<?= e($tipo) ?>" <?= (($productoEditar['tipo'] ?? '') === $tipo) ? 'selected' : '' ?>>
                                <?= e($tipo) ?>
                            </option>
                        <?php endforeach; ?>
                    </select>
                </label>

                <label>
                    Cantidad
                    <input type="number" name="cantidad" required min="0" value="<?= e((string) ($productoEditar['cantidad'] ?? '0')) ?>">
                </label>

                <label>
                    Stock
                    <input type="number" name="stock" required min="0" value="<?= e((string) ($productoEditar['stock'] ?? '0')) ?>">
                </label>

                <div class="acciones-formulario">
                    <button type="submit"><?= $productoEditar ? 'Actualizar' : 'Guardar' ?></button>
                    <?php if ($productoEditar): ?>
                        <a class="boton-secundario" href="index.php">Cancelar</a>
                    <?php endif; ?>
                </div>
            </form>
        </section>

        <section class="tarjeta">
            <h2>Productos registrados</h2>
            <div class="tabla-contenedor">
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre producto</th>
                            <th>Tipo</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                            <th>Stock</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php if (!$productos): ?>
                            <tr>
                                <td colspan="7" class="sin-datos">No hay productos registrados.</td>
                            </tr>
                        <?php endif; ?>

                        <?php foreach ($productos as $producto): ?>
                            <tr>
                                <td><?= e((string) $producto['id_producto']) ?></td>
                                <td><?= e($producto['nombre_producto']) ?></td>
                                <td><span class="pill"><?= e($producto['tipo']) ?></span></td>
                                <td>$<?= e(number_format((float) $producto['precio'], 2)) ?></td>
                                <td><?= e((string) $producto['cantidad']) ?></td>
                                <td><?= e((string) $producto['stock']) ?></td>
                                <td class="acciones-tabla">
                                    <a href="index.php?editar=<?= e((string) $producto['id_producto']) ?>">Editar</a>
                                    <a class="eliminar" href="eliminar.php?id_producto=<?= e((string) $producto['id_producto']) ?>" onclick="return confirm('¿Seguro que deseas eliminar este producto?')">Eliminar</a>
                                </td>
                            </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
            </div>
        </section>
    </main>
</body>
</html>
