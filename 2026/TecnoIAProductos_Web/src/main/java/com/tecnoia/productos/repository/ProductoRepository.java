package com.tecnoia.productos.repository;

import com.tecnoia.productos.model.Producto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Producto> listar() {
        String sql = "SELECT id_producto, nombre, categoria, precio, stock FROM productos ORDER BY id_producto DESC";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Producto(
                rs.getInt("id_producto"),
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getDouble("precio"),
                rs.getInt("stock")
        ));
    }

    public Producto buscarPorId(Integer idProducto) {
        String sql = "SELECT id_producto, nombre, categoria, precio, stock FROM productos WHERE id_producto = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Producto(
                rs.getInt("id_producto"),
                rs.getString("nombre"),
                rs.getString("categoria"),
                rs.getDouble("precio"),
                rs.getInt("stock")
        ), idProducto);
    }

    public void guardar(Producto producto) {
        String sql = "INSERT INTO productos(nombre, categoria, precio, stock) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, producto.getNombre(), producto.getCategoria(), producto.getPrecio(), producto.getStock());
    }

    public void actualizar(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, categoria = ?, precio = ?, stock = ? WHERE id_producto = ?";
        jdbcTemplate.update(sql, producto.getNombre(), producto.getCategoria(), producto.getPrecio(), producto.getStock(), producto.getIdProducto());
    }

    public void eliminar(Integer idProducto) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        jdbcTemplate.update(sql, idProducto);
    }
}
