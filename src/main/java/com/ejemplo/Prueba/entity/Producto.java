package com.ejemplo.Prueba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@Column(name ="id_productos")
	private Long idProductos;
	private String nombre;
	private String descripcion;
	private Integer cantidad;
	
	
	public Producto(Long idProductos, String nombre, String descripcion, Integer cantidad) {
		super();
		
		this.idProductos = idProductos;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdProductos() {
		return idProductos;
	}
	public void setIdProductos(Long idProductos) {
		this.idProductos = idProductos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	

}
