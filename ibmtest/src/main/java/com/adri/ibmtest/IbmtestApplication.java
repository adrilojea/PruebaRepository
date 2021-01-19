package com.adri.ibmtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adri.ibmtest.service.ProveedorService;

@SpringBootApplication
public class IbmtestApplication implements CommandLineRunner {

    public static void main(String[] args) {
	SpringApplication.run(IbmtestApplication.class, args);
    }

    @Autowired
    ProveedorService proveedorService;

    @Override
    public void run(String... args) throws Exception {
	if (args.length != 1) {
	    System.out.println("Introduzca un id de proveedor.");
	    System.exit(0);
	}

	final int idProveedor = Integer.parseInt(args[0]);
	proveedorService.generateProveedoresFile(idProveedor);
    }

}
