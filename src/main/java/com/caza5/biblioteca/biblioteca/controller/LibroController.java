package com.caza5.biblioteca.biblioteca.controller;

import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.DTO.LibroDTO;
import com.caza5.biblioteca.biblioteca.factory.LibroFactory;
import com.caza5.biblioteca.biblioteca.repository.LibroRepository;
import com.caza5.biblioteca.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @PostMapping("/save")
    //guardar libro
    public LibroDTO guardarLibro(@RequestBody LibroDTO libroDTO){
        return libroService.guardarLibro(libroDTO);
    }

    //buscar libros
    @GetMapping("/buscarLibro")
    public List<LibroDTO> buscarLibros(){
        return libroService.buscarLibros();
    }

    //buscar libro por id
    @GetMapping("/{libroId}")
    public ResponseEntity<LibroDTO> buscarLibroId(@PathVariable Integer libroId){
        return new ResponseEntity<>(libroService.buscarLibroId(libroId), HttpStatus.OK);
    }

    //Eliminar libro
    @DeleteMapping("/{libroId}")
    public ResponseEntity<HttpStatus>borrarLibro(@PathVariable Integer libroId){
        try{
            libroService.eliminarLibro(libroId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
