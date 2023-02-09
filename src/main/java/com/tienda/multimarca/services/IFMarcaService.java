package com.tienda.multimarca.services;

import com.tienda.multimarca.controllers.MarcaDTO;

import java.util.List;

public interface IFMarcaService  {
    public List<MarcaDTO>getMarcas(String token);

    MarcaDTO saveMarca(MarcaDTO request);

    public MarcaDTO udateMarca(MarcaDTO request);


    String deleteMarca(Long idMarca);
}
