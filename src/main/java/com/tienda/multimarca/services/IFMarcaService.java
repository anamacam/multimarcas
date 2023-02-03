package com.tienda.multimarca.services;

import com.tienda.multimarca.dto.MarcaDTO;

import java.util.List;

public interface IFMarcaService  {
    public List<MarcaDTO> getMarcas(String token);
}
