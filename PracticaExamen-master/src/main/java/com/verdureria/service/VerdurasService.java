
package com.verdureria.service;

import com.verdureria.entity.Verduras;
import com.verdureria.repository.VerdurasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerdurasService implements IVerdurasService{
    
    @Autowired //Inyeccion de dependencias
    private VerdurasRepository verdurasRepository;
    
    
    @Override
    public List<Verduras> getAllVerduras() {
        return (List<Verduras>)verdurasRepository.findAll();
    }

    @Override
    public Verduras getVerdurasById(Long id) {
        return verdurasRepository.findById(id).orElse(null);
    }
    @Override
    public void saveVerduras(Verduras verduras) {
        verdurasRepository.save(verduras);
    }

    @Override
    public void delete(long id) {
        verdurasRepository.deleteById(id);
    }
    
}
