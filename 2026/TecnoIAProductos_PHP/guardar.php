<?php
require_once __DIR__ . '/conexion.php';

$tiposPermitidos = ['Periférico', 'Almacenamiento', 'Hardware', 'Software', 'Otro'];

$idProducto = filter_input(INPUT_POST, 'id_producto', FILTER_VALIDATE_INT);
$nombreProducto = trim($_POST['nombre_producto'] ?? '');
$precio = filter_input(INPUT_POST, 'precio', FILTER_VALIDATE_FLOAT);
$tipo = $_POST['tipo'] ?? '';
$cantidad = filter_input(INPUT_POST, 'cantidad', FILTER_VALIDATE_INT);
$stock = filter_input(INPUT_POST, 'stock', FILTER_VALIDATE_INT);

if (
    $nombreProducto === '' ||
    $precio === false || $precio < 0 ||
    !in_array($tipo, $tiposPermitidos, true) ||
    $cantidad === false || $cantidad < 0 ||
    $stock === false || $stock < 0
) {
    header('Location: index.php?mensaje=datos_invalidos');
    exit;
}

if ($idProducto) {
    $consulta = $conexion->prepare(
        'UPDATE productos
         SET nombre_producto = :nombre_producto, precio = :precio, tipo = :tipo, cantidad = :cantidad, stock = :stock
         WHERE id_producto = :id_producto'
    );
    $consulta->execute([
        ':nombre_producto' => $nombreProducto,
        ':precio' => $precio,
        ':tipo' => $tipo,
        ':cantidad' => $cantidad,
        ':stock' => $stock,
        ':id_producto' => $idProducto,
    ]);

    header('Location: index.php?mensaje=actualizado');
    exit;
}

$consulta = $conexion->prepare(
    'INSERT INTO productos (nombre_producto, precio, tipo, cantidad, stock)
     VALUES (:nombre_producto, :precio, :tipo, :cantidad, :stock)'
);
$consulta->execute([
    ':nombre_producto' => $nombreProducto,
    ':precio' => $precio,
    ':tipo' => $tipo,
    ':cantidad' => $cantidad,
    ':stock' => $stock,
]);

header('Location: index.php?mensaje=creado');
exit;
