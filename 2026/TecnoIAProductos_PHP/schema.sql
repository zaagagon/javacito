CREATE DATABASE IF NOT EXISTS Tecnoia CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE Tecnoia;

CREATE TABLE IF NOT EXISTS productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(120) NOT NULL,
    UNIQUE KEY uq_productos_nombre_producto (nombre_producto),
    precio DECIMAL(10,2) NOT NULL,
    tipo ENUM('Periférico', 'Almacenamiento', 'Hardware', 'Software', 'Otro') NOT NULL,
    cantidad INT NOT NULL DEFAULT 0,
    stock INT NOT NULL DEFAULT 0,
    creado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO productos (nombre_producto, precio, tipo, cantidad, stock) VALUES
('Mouse Gamer X1', 85000.00, 'Periférico', 10, 10),
('SSD 1TB NVMe', 320000.00, 'Almacenamiento', 6, 6),
('Tarjeta gráfica RTX', 1800000.00, 'Hardware', 2, 2)
ON DUPLICATE KEY UPDATE nombre_producto = nombre_producto;
