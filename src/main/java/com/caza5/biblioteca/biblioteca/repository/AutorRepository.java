package com.caza5.biblioteca.biblioteca.repository;

import com.caza5.biblioteca.biblioteca.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Integer> {
}
