package com.cuasatar.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cuasatar.book.entity.Libro;

@RepositoryRestResource(collectionResourceRel="Libros", path="libros")

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
