package com.adri.ibmtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adri.ibmtest.service.ProveedorService;
import com.adri.ibmtest.service.ProveedorServiceImpl;

@SpringBootApplication
public class IbmtestApplication {

    public static void main(String[] args) {
	SpringApplication.run(IbmtestApplication.class, args);
	if (args.length != 1) {
	    System.out.println("Introduzca un id de proveedor.");
	    System.exit(0);
	}

	final ProveedorService proveedorService = new ProveedorServiceImpl();
	final int idProveedor = Integer.parseInt(args[0]);
	proveedorService.generateProveedoresFile(idProveedor);
    }

}
