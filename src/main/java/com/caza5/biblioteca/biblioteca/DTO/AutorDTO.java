package com.caza5.biblioteca.biblioteca.DTO;

import com.caza5.biblioteca.biblioteca.models.AutorModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorDTO {
    private Integer autorId;
    private String nombre;
    private String apellido;
    private String telefono;

    //constructor
    public AutorDTO(AutorModel autorModel) {
        this.autorId = autorModel.getAutorId();
        this.nombre = autorModel.getNombre();
        this.apellido = autorModel.getApellido();
        this.telefono = autorModel.getTelefono();
    }
    //getter y setters

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
