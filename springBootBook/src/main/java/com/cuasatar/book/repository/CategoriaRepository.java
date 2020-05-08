package com.cuasatar.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cuasatar.book.entity.Categoria;

@RepositoryRestResource(collectionResourceRel="categoriaLibros", path="categoria-libros")
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
