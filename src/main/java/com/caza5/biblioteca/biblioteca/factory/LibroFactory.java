package com.caza5.biblioteca.biblioteca.factory;

import com.caza5.biblioteca.biblioteca.DTO.LibroDTO;
import com.caza5.biblioteca.biblioteca.models.LibroModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibroFactory {
    //crear objeto modelo
    public LibroModel crearLibro(LibroDTO libroDTO){
        return new LibroModel(libroDTO);
    }

    //crear DTO
    public LibroDTO crearLibroDTO(LibroModel libroModel){
        return new LibroDTO(libroModel);
    }

    //Crear autores DTO  a partir de una LISTA
    public List<LibroDTO> crearLibrosDTO(List<LibroModel>listaLibros){
        List<LibroDTO> listaLibrosDTO = new ArrayList<>();
        listaLibros.stream().forEach(
                libroDTO -> {
                    listaLibrosDTO.add(crearLibroDTO(libroDTO));
                }
        );
        return listaLibrosDTO;
    }

}
