package com.tienda.multimarca.controllers;

import com.tienda.multimarca.services.IFMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/service")
public class MarcaController {


    @Autowired
    IFMarcaService service;

    //@ResponseStatus
    @GetMapping("/getMarcas")
    @ResponseStatus(HttpStatus.OK)
    public List<MarcaDTO> getMarcas(@RequestHeader("Autenticador")String token) {
        return service.getMarcas(token);

    }

    @GetMapping("/getMarcasxId/{idMarca}")
    @ResponseStatus(HttpStatus.OK)
    public MarcaDTO getMarcasxId(@PathVariable Long idMarca) {
        return service.getMarcasxId(dMarca);
    }



    //POST --> Insertar
    @PostMapping("/saveMarca")
    @ResponseStatus(HttpStatus.CREATED)
    public MarcaDTO save(@RequestBody MarcaDTO request) {
        return service.saveMarca(request);

    }

    //ResponseEntity

    //PUT --> Actualizar
    @PutMapping("/updateMarca")
    @ResponseStatus(HttpStatus.OK)
    public MarcaDTO update(@RequestBody MarcaDTO request) {
        return service.udateMarca(request);
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

