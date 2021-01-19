package com.adri.ibmtest.repository;

import java.util.List;

import com.adri.ibmtest.service.model.Proveedor;

public interface ProveedorRepository {
    List<Proveedor> getProveedor(int idProveedor);
}
