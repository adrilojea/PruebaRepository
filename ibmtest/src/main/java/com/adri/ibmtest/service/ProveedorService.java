package com.adri.ibmtest.service;

/**
 * Clase para el procesamiento de datos de proveedores.
 * 
 * @author adri
 *
 */
public interface ProveedorService {
    /**
     * Genera un fichero con los proveedores asocieado al id del cliente.
     * 
     * @param clienteId: id del cliente a buscar
     */
    void generateProveedoresFile(int clienteId);
}
