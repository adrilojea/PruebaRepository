package com.adri.ibmtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.ibmtest.service.model.Proveedor;

/**
 * Clase para la conexión de datos relacionado con proveedores.
 * 
 * @author adri
 *
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    List<Proveedor> findByIdCliente(Integer idCliente);
}
