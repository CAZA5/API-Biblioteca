package com.caza5.biblioteca.biblioteca.factory;

import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.models.AutorModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AutorFactory {
    //Crea objeto modelo
    public AutorModel crearAutor(AutorDTO autorDTO){
        return new AutorModel(autorDTO);
    }

    //crear objeto dto
    public AutorDTO crearAutorDTO(AutorModel autorModel){
        return new AutorDTO(autorModel);
    }

    //procesar lista de objetos
    public List<AutorDTO> crearAutoresDTO(List<AutorModel> listaAutores){
        List<AutorDTO> listaAutoresDTO = new ArrayList<>();
        listaAutores.stream().forEach(
                autor ->{
                    listaAutoresDTO.add(crearAutorDTO(autor));
                }
        );
        return listaAutoresDTO;
    }
}
