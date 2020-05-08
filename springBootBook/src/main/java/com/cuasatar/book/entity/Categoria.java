package com.cuasatar.book.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3385676738969283061L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CategoriaIdGenerator")	
	@SequenceGenerator(name = "CategoriaIdGenerator", sequenceName = "categoria_pk_seq", allocationSize = 1)
	private Long id;
	
	@Column(unique=true)
	private String nombreCategoria;


}
