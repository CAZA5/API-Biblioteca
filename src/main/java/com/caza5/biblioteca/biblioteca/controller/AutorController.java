package com.caza5.biblioteca.biblioteca.controller;

import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/biblioteca")
public class AutorController {
    @Autowired
    private AutorService autorService;
    //metodo guardar
    @PostMapping("/guardar")
    public ResponseEntity<AutorDTO> guadarAutor(@RequestBody AutorDTO autorDTO){
        return new ResponseEntity<>(autorService.guardarAutor(autorDTO), HttpStatus.OK);
    }


    //metodo buscar todos los registro
    @GetMapping
    public  List<AutorDTO> buscarTodosLosRegistros(){
        return autorService.buscarAutores();
    }

}
