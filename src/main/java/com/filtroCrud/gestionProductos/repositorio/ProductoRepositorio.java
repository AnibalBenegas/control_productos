package com.filtroCrud.gestionProductos.repositorio;

import com.filtroCrud.gestionProductos.entidades.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, String>{
    
    @Query("SELECT p FROM Productos p WHERE "
            + "CONCAT(p.id, p.codigo, p.nombre, p.marca, p.hechoEn, p.precio) "
            + "LIKE %?1%")
    public List<Productos> finAll(String palabraClave);
    
}
