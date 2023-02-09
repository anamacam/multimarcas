package com.tienda.multimarca.services;

import com.tienda.multimarca.controllers.MarcaDTO;
import com.tienda.multimarca.repository.IFMarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class MarcaServiceImple implements IFMarcaService{

    @Autowired
    IFMarcaRepository repo;

    public List<MarcaDTO> getMarcas(String token) {

        return repo.getMarcas();
    }

    @Override
    public MarcaDTO saveMarca(MarcaDTO request) {
        return repo.saveMarca(request);
    }

    @Override
    public MarcaDTO udateMarca(MarcaDTO request) {
        return repo.udateMarca(request);
    }

    @Override
    public String deleteMarca(Long idMarca) {
        repo.deleteMarca(idMarca);

        return null;
    }
}
