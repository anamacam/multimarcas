package com.tienda.multimarca.controllers;

import com.tienda.multimarca.dto.MarcaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")
public class MarcaController {

    @GetMapping("/getMarcas")
    public List<MarcaDTO>getMarcas(@RequestHeader ("Autenticador" ) String token){
        System.out.println(("Token enviado:"+ token));
        List<MarcaDTO> listaMarcas = new ArrayList<>();
        listaMarcas.add(new MarcaDTO(1L,"Lenovo"));
        listaMarcas.add(new MarcaDTO(2L,"HP"));

        return listaMarcas;

    }

    //POST --> Insertar
    @PostMapping("/saveMarca")
    public MarcaDTO save(@RequestBody MarcaDTO request){

        MarcaDTO response = request;
        response.setIdMarca(1l);
        return response;

    }

    //PUT --> Actualizar
    @PutMapping("/updateMarca")
    public MarcaDTO update(@RequestBody MarcaDTO request){
        MarcaDTO response = request;
        return response;
    }

    // DELETE --> Eliminar
    @DeleteMapping("/deleteMarca/{idMarca}")
    public String delete(@PathVariable Long idMarca){
        return "ok";
    }
}
