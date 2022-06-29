package com.verdureria.service;

import com.verdureria.entity.Tiendas;
import com.verdureria.repository.TiendasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TiendasService implements ITiendasService {
    
    @Autowired //Inyeccion de dependencias
    private TiendasRepository tiendasRepository;
    
    @Override
    public List<Tiendas> listStores() {
        return (List<Tiendas>)tiendasRepository.findAll();
    }
    
}
