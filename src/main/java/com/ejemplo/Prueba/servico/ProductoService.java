package com.ejemplo.Prueba.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.Prueba.entity.Producto;
import com.ejemplo.Prueba.repository.PoductoRepository;


@Service
public class ProductoService {

    private final PoductoRepository repo;

    public ProductoService(PoductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto guardar(Producto p) {
        return repo.save(p);
    }

    public Producto buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}