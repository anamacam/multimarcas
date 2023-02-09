package com.tienda.multimarca.repository;

import com.tienda.multimarca.controllers.MarcaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class MarcasRepositoryImp implements IFMarcaRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<MarcaDTO> getMarcas() {
        List<MarcaDTO> ltMarcas = null;

        ltMarcas = jdbcTemplate.query("SELECT * FROM MARCAS", (rs, rowNum) ->
                new MarcaDTO(
                        rs.getLong("ID"),
                        rs.getString("NOMBRE")
                ));

        return ltMarcas;
    }

    @Override
    public MarcaDTO saveMarca(MarcaDTO request) {
        int cantRegUpd = jdbcTemplate.update("INSERT INTO MARCAS('NOMBRE')VALUES (?)",request.getNombreMarca());
        System.out.println("cantRegUpd"+ cantRegUpd);
        return request;
    }

    @Override
    public MarcaDTO udateMarca(MarcaDTO request) {
        int cantRegUpd = jdbcTemplate.update("UPDATE MARCAS SET NOMBRE=? WHERE ID = ?)",request.getNombreMarca(),
                request.getIdMarca());
        System.out.println("cantRegUpd"+ cantRegUpd);
        return request;
    }

    @Override
    public String deleteMarca(Long idMarca) {

        return "";
    }
}
