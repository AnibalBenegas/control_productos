package com.filtroCrud.gestionProductos;

import com.filtroCrud.gestionProductos.entidades.Productos;
import com.filtroCrud.gestionProductos.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionProductosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionProductosApplication.class, args);
	}
            
    @Autowired
    private ProductoRepositorio producto;

    @Override
    public void run(String... args) throws Exception {
        
        /*
        Productos producto1 = new Productos("0721450766390", "FOTOGRAFICO GLOSSY AUTOADHESIVO", "MGN", "CHINA", "3250");
        producto.save(producto1);
        Productos producto2 = new Productos("77941554", "CIGARRILLOS RUBIOS PAQ 20 KING SIZE", "MASTER", "ARGENTINA", "380");
        producto.save(producto2);
        Productos producto3 = new Productos("0076625285191", "AZUCAR BLANCA REFINADA 1KG", "CRISOF", "ARGENTINA", "590");
        producto.save(producto3);
        Productos producto4 = new Productos("7790150100752", "CAFE INSTANTANEO CLASICO 100GS", "LA VIRGINIA", "ARGENTINA", "650");
        producto.save(producto4);*/
    }

}
