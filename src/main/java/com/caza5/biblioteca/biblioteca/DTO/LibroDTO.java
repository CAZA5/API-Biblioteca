package com.caza5.biblioteca.biblioteca.DTO;
import com.caza5.biblioteca.biblioteca.models.LibroModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@NoArgsConstructor
public class LibroDTO {
    private Integer libroId;
    private String nombre;
    private String editorial;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    private AutorDTO autorDTO;
    private Integer idAutor;

    //constructor
    public LibroDTO(LibroModel libroModel){
        this.libroId = libroModel.getLibroId();
        this.nombre = libroModel.getNombre();
        this.editorial = libroModel.getEditorial();
        this.precio = libroModel.getPrecio();
        this.fechaEdicion = libroModel.getFechaEdicion();
        this.autorDTO = new AutorDTO(libroModel.getAutor());


    }
    //getters y setter

    public Integer getLibroId() {
        return libroId;
    }

    public void setLibroId(Integer libroId) {
        this.libroId = libroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDate getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(LocalDate fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public AutorDTO getAutorDTO() {
        return autorDTO;
    }

    public void setAutorDTO(AutorDTO autorDTO) {
        this.autorDTO = autorDTO;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
}
