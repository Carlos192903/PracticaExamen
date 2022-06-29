package com.verdureria.service;

import com.verdureria.entity.Verduras;
import java.util.List;

public interface IVerdurasService {
    public List<Verduras> getAllVerduras();
    public Verduras getVerdurasById (Long id);
    public void saveVerduras (Verduras verduras);
    public void delete(long id);
}
