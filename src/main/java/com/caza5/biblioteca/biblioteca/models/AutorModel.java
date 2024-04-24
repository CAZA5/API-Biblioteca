package com.caza5.biblioteca.biblioteca.models;
import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Anotaciones
@Data
@NoArgsConstructor
@Entity
@Table(name="autores")
//Entidad de la base de datos
public class AutorModel {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer autorId;
    private String nombre;
    private String apellido;
    private String telefono;
    //@OneToMany(mappedBy = "autor")
    //List<LibroModel>libros;

    //getters

    public Integer getAutorId() {
        return autorId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    //setters

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Factory
    public AutorModel(AutorDTO autorDTO){
        this.autorId = autorDTO.getAutorId();
        this.nombre = autorDTO.getNombre();
        this.apellido = autorDTO.getApellido();
        this.telefono = autorDTO.getTelefono();

    }
}
