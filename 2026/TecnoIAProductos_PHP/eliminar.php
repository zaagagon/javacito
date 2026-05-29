<?php
require_once __DIR__ . '/conexion.php';

$idProducto = filter_input(INPUT_GET, 'id_producto', FILTER_VALIDATE_INT);

if (!$idProducto) {
    header('Location: index.php?mensaje=id_invalido');
    exit;
}

$consulta = $conexion->prepare('DELETE FROM productos WHERE id_producto = :id_producto');
$consulta->execute([':id_producto' => $idProducto]);

header('Location: index.php?mensaje=eliminado');
exit;
