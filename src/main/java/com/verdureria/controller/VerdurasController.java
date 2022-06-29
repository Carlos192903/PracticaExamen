package com.verdureria.controller;

import com.verdureria.entity.Tiendas;
import com.verdureria.entity.Verduras;
import com.verdureria.service.ITiendasService;
import com.verdureria.service.IVerdurasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VerdurasController {

    @Autowired 
    private IVerdurasService verdurasService;
    
    @Autowired 
    private ITiendasService tiendasService;
    
    //Jala la info de la base de datos al html
    //Este lee data
    @GetMapping("/verduras")
    public String index (Model model){
        List<Verduras> listaVerduras=verdurasService.getAllVerduras();
        model.addAttribute("titulo", "Tabla Verduras");
        model.addAttribute("verduras", listaVerduras);
        return "verduras";
    }
    
    //Crear un CRUD - Create - read - update and delete
    
    @GetMapping("/verdurasN")
    public String CrearPersona (Model model){
        List<Tiendas> listaTiendas=tiendasService.listStores();
        model.addAttribute("verduras", new Verduras()); //Creando un objeto d etipo persona
        model.addAttribute("tiendas", listaTiendas);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarVerduras (@ModelAttribute Verduras verduras){//el @ lo que dice es que le envio a la base de datos este atributo o paramentro
        verdurasService.saveVerduras(verduras);
        return "redirect:/verduras";
    }
    
    @GetMapping("/editVerduras/{id}")
    public String editarVerduras (@PathVariable("id") Long idVerduras, Model model){
        Verduras verduras = verdurasService.getVerdurasById(idVerduras);
        List<Tiendas> listaTiendas=tiendasService.listStores();
        model.addAttribute("verduras", verduras); //Creando un objeto d etipo persona
        model.addAttribute("tiendas", listaTiendas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarVerduras (@PathVariable("id") Long idVerduras){
        verdurasService.delete(idVerduras);
        
        return "redirect:/verduras";
    }
}
