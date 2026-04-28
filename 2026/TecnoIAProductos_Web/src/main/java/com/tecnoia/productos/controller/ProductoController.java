package com.tecnoia.productos.controller;

import com.tecnoia.productos.model.Producto;
import com.tecnoia.productos.repository.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping({"/", "/productos"})
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoRepository.listar());
        return "productos";
    }

    @GetMapping("/productos/nuevo")
    public String nuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("modo", "nuevo");
        return "formulario";
    }

    @PostMapping("/productos/guardar")
    public String guardarProducto(@ModelAttribute Producto producto) {
        if (producto.getIdProducto() == null) {
            productoRepository.guardar(producto);
        } else {
            productoRepository.actualizar(producto);
        }
        return "redirect:/productos";
    }

    @GetMapping("/productos/editar/{id}")
    public String editarProducto(@PathVariable Integer id, Model model) {
        model.addAttribute("producto", productoRepository.buscarPorId(id));
        model.addAttribute("modo", "editar");
        return "formulario";
    }

    @GetMapping("/productos/eliminar/{id}")
    public String eliminarProducto(@PathVariable Integer id) {
        productoRepository.eliminar(id);
        return "redirect:/productos";
    }
}
