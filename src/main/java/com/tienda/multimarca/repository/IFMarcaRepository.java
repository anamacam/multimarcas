package com.tienda.multimarca.repository;

import com.tienda.multimarca.controllers.MarcaDTO;

import java.util.List;

public interface IFMarcaRepository {
    public List<MarcaDTO> getMarcas();

    public MarcaDTO saveMarca(MarcaDTO request);

    public MarcaDTO udateMarca(MarcaDTO request);

    public String deleteMarca(Long idMarca);

}
