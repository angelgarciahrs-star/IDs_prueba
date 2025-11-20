package com.ejemplo.Prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.Prueba.entity.Producto;

public interface PoductoRepository extends JpaRepository<Producto, Long>{

}
