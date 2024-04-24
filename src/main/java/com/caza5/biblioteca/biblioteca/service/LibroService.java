package com.caza5.biblioteca.biblioteca.service;

import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.DTO.LibroDTO;
import com.caza5.biblioteca.biblioteca.factory.AutorFactory;
import com.caza5.biblioteca.biblioteca.factory.LibroFactory;
import com.caza5.biblioteca.biblioteca.models.AutorModel;
import com.caza5.biblioteca.biblioteca.repository.AutorRepository;
import com.caza5.biblioteca.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LibroService {
    @Autowired
    private LibroFactory libroFactory;
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorFactory autorFactory;
    @Autowired
    private AutorRepository autorRepository;

    //metodos
    //guardar libro
    //buscar autor


    public LibroDTO guardarLibro(LibroDTO libroDTO){
        AutorModel autor = autorRepository.findById(libroDTO.getIdAutor()).get();
        libroDTO.setAutorDTO(autorFactory.crearAutorDTO(autor));
        return libroFactory.crearLibroDTO(libroRepository.save(libroFactory.crearLibro(libroDTO)));
    }

    //consultar registro de la base de datos
    public List<LibroDTO> buscarLibros(){
        return libroFactory.crearLibrosDTO(libroRepository.findAll());
    }

    //buscar libro por id
    public LibroDTO buscarLibroId(Integer libroId){
        return libroFactory.crearLibroDTO(libroRepository.findById(libroId).get());
    }

    //eliminar libro
    public void eliminarLibro(Integer libroId){
        libroRepository.deleteById(libroId);
    }
}
