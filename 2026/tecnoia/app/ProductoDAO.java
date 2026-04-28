package com.tecnoia.dao;

import com.tecnoia.conexion.ConexionBD;
import com.tecnoia.modelo.Producto;
import java.sql.*;

public class ProductoDAO {

    public void insertarProducto(Producto producto) {
        String sql = "INSERT INTO productos(nombre, categoria, precio, stock) VALUES (?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());

            ps.executeUpdate();
            System.out.println("Producto insertado correctamente.");

        } catch (SQLException error) {
            System.out.println("Error al insertar: " + error.getMessage());
        }
    }

    public void consultarProductos() {
        String sql = "SELECT * FROM productos";

        try (Connection conexion = ConexionBD.conectar();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id_producto") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("categoria") + " - $" +
                    rs.getDouble("precio") + " - Stock: " +
                    rs.getInt("stock")
                );
            }

        } catch (SQLException error) {
            System.out.println("Error al consultar: " + error.getMessage());
        }
    }

    public void actualizarProducto(int idProducto, double nuevoPrecio, int nuevoStock) {
        String sql = "UPDATE productos SET precio = ?, stock = ? WHERE id_producto = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, nuevoStock);
            ps.setInt(3, idProducto);

            ps.executeUpdate();
            System.out.println("Producto actualizado correctamente.");

        } catch (SQLException error) {
            System.out.println("Error al actualizar: " + error.getMessage());
        }
    }

    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idProducto);
            ps.executeUpdate();

            System.out.println("Producto eliminado correctamente.");

        } catch (SQLException error) {
            System.out.println("Error al eliminar: " + error.getMessage());
        }
    }
}