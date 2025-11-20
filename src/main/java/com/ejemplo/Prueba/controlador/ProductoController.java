package com.ejemplo.Prueba.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.Prueba.entity.Producto;
import com.ejemplo.Prueba.servico.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	  private final ProductoService service;

	    public ProductoController(ProductoService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<Producto> listar() {
	        return service.listar();
	    }

	    @GetMapping("/{id}")
	    public Producto obtenerPorId(@PathVariable Long id) {
	        return service.buscarPorId(id);
	    }

	    @PostMapping
	    public Producto guardar(@RequestBody Producto p) {
	        return service.guardar(p);
	    }

	    @DeleteMapping("/{id}")
	    public String eliminar(@PathVariable Long id) {
	        service.eliminar(id);
	        return "Producto eliminado correctamente";
	    }
	    @GetMapping("/prueba")
	    public String prueba() {
	        return "Funciona";
	    }
	   

}
