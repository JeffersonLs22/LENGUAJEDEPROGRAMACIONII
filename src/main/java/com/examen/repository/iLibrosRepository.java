package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.model.Tb_Libro;
import java.util.List;

public interface iLibrosRepository extends JpaRepository<Tb_Libro, Long> {
    List<Tb_Libro> findAll();
}
