package com.tecnoia.app;

import com.tecnoia.dao.ProductoDAO;
import com.tecnoia.modelo.Producto;

public class Principal {

    public static void main(String[] args) {

        ProductoDAO productoDAO = new ProductoDAO();

        Producto producto = new Producto("Disco SSD 1TB", "Almacenamiento", 420000, 7);

        productoDAO.insertarProducto(producto);

        productoDAO.consultarProductos();

        productoDAO.actualizarProducto(1, 90000, 15);

        productoDAO.consultarProductos();

        productoDAO.eliminarProducto(2);

        productoDAO.consultarProductos();
    }
}
