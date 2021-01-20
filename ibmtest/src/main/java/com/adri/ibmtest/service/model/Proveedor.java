package com.adri.ibmtest.service.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProveedor;

    private String nombre;

    private LocalDate fechaAlta;

    private Integer idCliente;

    public Proveedor() {
	super();
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
