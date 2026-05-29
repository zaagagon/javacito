# CRUD Productos Tecnoia en PHP

Aplicación PHP sencilla para la base de datos **Tecnoia**. Permite visualizar, insertar, editar y eliminar registros de la tabla `productos`.

## Campos de la tabla

- `id_producto`
- `nombre_producto`
- `precio`
- `tipo` con opciones: Periférico, Almacenamiento, Hardware, Software u Otro
- `cantidad`
- `stock`
- `creado_en`

## Requisitos

- PHP 8 o superior con extensión PDO MySQL
- MySQL o MariaDB
- Servidor local como XAMPP, Laragon, WAMP o el servidor integrado de PHP

## Instalación

1. Crea la base de datos y la tabla ejecutando el archivo `schema.sql` en MySQL.
2. Revisa las credenciales en `conexion.php`:
   - Host: `localhost`
   - Base de datos: `Tecnoia`
   - Usuario: `root`
   - Contraseña: vacía
3. Ejecuta el proyecto desde esta carpeta:

```bash
php -S localhost:8000
```

4. Abre en el navegador:

```text
http://localhost:8000
```

## Archivos principales

- `index.php`: formulario, listado de productos y enlaces para editar/eliminar.
- `guardar.php`: inserta y actualiza productos.
- `eliminar.php`: elimina productos por `id_producto`.
- `conexion.php`: conexión PDO a MySQL.
- `styles.css`: estilos de la interfaz.
- `schema.sql`: base de datos, tabla y datos de ejemplo.
