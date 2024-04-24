package com.caza5.biblioteca.biblioteca.models;


import com.caza5.biblioteca.biblioteca.DTO.AutorDTO;
import com.caza5.biblioteca.biblioteca.DTO.LibroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
//Anotaciones
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="libros")
public class LibroModel {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer libroId;
    private String nombre;
    private String editorial;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    @ManyToOne
    private AutorModel autor;

    //getters y setters

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

    public AutorModel getAutor() {
        return autor;
    }

    public void setAutor(AutorModel autor) {
        this.autor = autor;
    }

    //Factory
    public LibroModel(LibroDTO libroDTO){
        this.libroId = libroDTO.getLibroId();
        this.nombre = libroDTO.getNombre();
        this.editorial = libroDTO.getEditorial();
        this.precio = libroDTO.getPrecio();
        this.fechaEdicion = libroDTO.getFechaEdicion();
        this.autor = new AutorModel(libroDTO.getAutorDTO());
    }
}




