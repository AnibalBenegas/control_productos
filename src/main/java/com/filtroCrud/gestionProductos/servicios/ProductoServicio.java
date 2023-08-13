package com.filtroCrud.gestionProductos.servicios;

import com.filtroCrud.gestionProductos.entidades.Productos;
import com.filtroCrud.gestionProductos.repositorio.ProductoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {
    
    @Autowired
    private ProductoRepositorio repositorio;
    
    public List<Productos> listAll(String palabraClave){
        if (palabraClave != null) {
            return repositorio.finAll(palabraClave);
        }
        return repositorio.findAll();
    }
    
    public void save(Productos producto){
        repositorio.save(producto);
    }
    
    public Productos get(String id){
        return repositorio.findById(id).get(); 
    }
    
    public void delete(String id){
        repositorio.deleteById(id);
    }
}
