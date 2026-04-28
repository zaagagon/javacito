CREATE DATABASE IF NOT EXISTS tecnoia;
USE tecnoia;

CREATE TABLE IF NOT EXISTS productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

INSERT INTO productos (nombre, categoria, precio, stock)
VALUES 
('Mouse Gamer X1', 'Accesorios', 85000, 10),
('Teclado Mecánico K500', 'Accesorios', 150000, 8),
('Monitor 24 Full HD', 'Monitores', 620000, 5);
