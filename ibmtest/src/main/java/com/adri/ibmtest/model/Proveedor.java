package com.adri.ibmtest.model;

import java.time.LocalDate;

public class Proveedor {

	private int idProveedor;
	
	private String nombre;
	
	private LocalDate fechaAlta;
	
	private Integer idCliente;

	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
