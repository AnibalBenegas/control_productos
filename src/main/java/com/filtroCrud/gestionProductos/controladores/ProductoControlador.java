package com.filtroCrud.gestionProductos.controladores;

import com.filtroCrud.gestionProductos.entidades.Productos;
import com.filtroCrud.gestionProductos.servicios.ProductoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductoControlador {

    @Autowired
    private ProductoServicio servicio;

    @RequestMapping
    public String verPaginaInicio(Model modelo, @Param("palabraClave") String palabraClave) {
        List<Productos> listaProducto = servicio.listAll(palabraClave);
        
        modelo.addAttribute("producto", listaProducto);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index";
    }

    @RequestMapping("/nuevo")
    public String agregarProducto(Model modelo) {
        Productos producto = new Productos();
        modelo.addAttribute("producto", producto);
        return "formulario_producto";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarProducto(@ModelAttribute("producto") Productos producto) {
        servicio.save(producto);
        return "redirect:/";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView editarProducto(@PathVariable(name = "id") String id) {
        ModelAndView modelo = new ModelAndView("editar_producto");
        Productos producto = servicio.get(id);
        modelo.addObject("producto", producto);
        return modelo;
    }
    
    @RequestMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable(name = "id") String id){
        System.out.println("\n**************************************\n Eliminar "+ id + "\n**************************************\n");
        servicio.delete(id);
        return "redirect:/";
    }
}
