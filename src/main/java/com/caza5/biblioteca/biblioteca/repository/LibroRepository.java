package com.caza5.biblioteca.biblioteca.repository;

import com.caza5.biblioteca.biblioteca.models.LibroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<LibroModel, Integer> {
}
