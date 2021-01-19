package com.adri.ibmtest.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.adri.ibmtest.repository.ProveedorRepository;
import com.adri.ibmtest.repository.ProveedorRepositoryImpl;
import com.adri.ibmtest.service.model.Proveedor;

public class ProveedorServiceImpl implements ProveedorService {

    private static final String FICHERO_PROVEEDORES = "Proveedores.txt";
    private static final String ERROR_FILE = "Ha surgido un error.";
    private static final String ERROR_PROVEEDORES = "El cliente no tiene proveedores asignados.";

    private final ProveedorRepository repository = new ProveedorRepositoryImpl();

    @Override
    public void generateProveedoresFile(int proveedorId) {
	final List<Proveedor> proveedores = repository.getProveedor(proveedorId);
	if (!proveedores.isEmpty()) {
	    createFile();
	    writeProveedoresToFile(proveedores);
	} else {
	    System.out.println(ERROR_PROVEEDORES);
	}

    }

    private void createFile() {

	try {
	    File myObj = new File(FICHERO_PROVEEDORES);
	    if (myObj.createNewFile()) {
		System.out.println("File created: " + myObj.getName());
	    } else {
		System.out.println("File already exists.");
	    }
	} catch (IOException e) {
	    System.out.println(ERROR_FILE);
	    e.printStackTrace();
	}

    }

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
