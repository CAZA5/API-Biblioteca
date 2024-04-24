package com.caza5.biblioteca.biblioteca.service;

import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.factory.AutorFactory;
import com.caza5.biblioteca.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AutorService {
    //Factory
    @Autowired
    private AutorFactory autorFactory;

    //Repository
    @Autowired
    private AutorRepository autorRepository;

    //Guardar un autor
    public AutorDTO guardarAutor(AutorDTO autorDTO){
        return autorFactory.crearAutorDTO(autorRepository.save(autorFactory.crearAutor(autorDTO)));
    }
    //Obtener registros
    public List<AutorDTO> buscarAutores(){
        return autorFactory.crearAutoresDTO(autorRepository.findAll());
    }

    //buscar id
    public AutorDTO buscarAutorId(Integer autorId){
        return autorFactory.crearAutorDTO(autorRepository.findById(autorId).get());
    }

    //borrar autor por id
    public void borrarAutorId(Integer autorId){
        autorRepository.deleteById(autorId);
    }
}
