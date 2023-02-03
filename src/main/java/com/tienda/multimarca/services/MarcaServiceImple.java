package com.tienda.multimarca.services;

import com.tienda.multimarca.dto.MarcaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MarcaServiceImple implements IFMarcaService{

    public List<MarcaDTO> getMarcas(String token) {
        List<MarcaDTO> listaMarcas = new ArrayList<>();
        listaMarcas.add(new MarcaDTO(1L, "Lenovo"));
        listaMarcas.add(new MarcaDTO(2L, "HP"));
        return listaMarcas;
    }
}
