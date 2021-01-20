package com.adri.ibmtest.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.ibmtest.repository.ProveedorRepository;
import com.adri.ibmtest.service.model.Proveedor;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private static final String FICHERO_PROVEEDORES = "Proveedores.txt";
    private static final String ERROR_FILE = "Ha surgido un error.";
    private static final String ERROR_PROVEEDORES = "El cliente no tiene proveedores asignados.";

    private final ProveedorRepository repository;

    @Autowired
    public ProveedorServiceImpl(ProveedorRepository repository) {
	this.repository = repository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void generateProveedoresFile(int clienteId) {
	final List<Proveedor> proveedores = repository.findByIdCliente(clienteId);
	if (!proveedores.isEmpty()) {
	    createFile();
	    writeProveedoresToFile(proveedores);
	} else {
	    System.out.println(ERROR_PROVEEDORES);
	}

    }

    /**
     * Crea el fichero donde se guardaran los proveedores.
     */
    private void createFile() {
	if (Files.exists(Paths.get(FICHERO_PROVEEDORES))) {
	    System.out.println("El fichero ya existe.");
	} else {
	    File myObj = new File(FICHERO_PROVEEDORES);
	    System.out.println("Fichero creado: " + myObj.getName());
	}

    }

    /**
     * Almacena en el fichero la lista de proveedores.
     */
    private void writeProveedoresToFile(final List<Proveedor> proveedores) {
	try {
	    FileWriter fw = new FileWriter(FICHERO_PROVEEDORES);
	    BufferedWriter bw = new BufferedWriter(fw);
	    for (Proveedor p : proveedores) {
		bw.write(p.getIdProveedor() + ", " + p.getNombre() + ", " + p.getFechaAlta().toString() + ", "
			+ p.getIdCliente());
		bw.newLine();
	    }
	    bw.flush();
	    System.out.println("Guardado de proveedores realizado con éxito.");
	} catch (IOException e) {
	    System.out.println(ERROR_FILE);
	    e.printStackTrace();
	}
    }

}
