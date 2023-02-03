package com.tienda.multimarca.controllers;

import com.tienda.multimarca.dto.MarcaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")
public class MarcaController {

    //@ResponseStatus

    @GetMapping("/getMarcas")
    @ResponseStatus(HttpStatus.OK)
    public List<MarcaDTO> getMarcas(@RequestHeader("Autenticador") String token) {
        System.out.println(("Token enviado:" + token));
        List<MarcaDTO> listaMarcas = new ArrayList<>();
        listaMarcas.add(new MarcaDTO(1L, "Lenovo"));
        listaMarcas.add(new MarcaDTO(2L, "HP"));

        return listaMarcas;

    }

    //POST --> Insertar
    @PostMapping("/saveMarca")
    @ResponseStatus(HttpStatus.CREATED)
    public MarcaDTO save(@RequestBody MarcaDTO request) {

        MarcaDTO response = request;
        response.setIdMarca(1l);
        return response;

    }

    //ResponseEntity

    //PUT --> Actualizar
    @PutMapping("/updateMarca")
    public ResponseEntity<MarcaDTO> update(@RequestBody MarcaDTO request) {
        MarcaDTO response = request;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // DELETE --> Eliminar
    @DeleteMapping("/deleteMarca/{idMarca}")
    public ResponseEntity<String> delete(@PathVariable Long idMarca) {
        System.out.println("idMarca" + idMarca);

        if (idMarca==1L) {
            return new ResponseEntity<>("Dato incorrecto", HttpStatus.BAD_REQUEST);
        }

        if (idMarca > 4L) {
            return new ResponseEntity<>("No existe", HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>("ok", HttpStatus.NO_CONTENT);
        }
    }

