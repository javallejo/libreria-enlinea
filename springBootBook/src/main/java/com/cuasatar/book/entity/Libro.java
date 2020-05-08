package com.cuasatar.book.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Libro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7992147962564874645L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LibroIdGenerator")	
	@SequenceGenerator(name = "LibroIdGenerator", sequenceName = "libro_pk_seq", allocationSize = 1)			
	Long id;	
	@Column
	String sku;
	@Column
	String nombre;
	@Column
	String descripcion;
	@Column
	Double precioUnitario;
	@Column
	String urlImagen;
	@Column(columnDefinition="BIT")
	private Boolean activo;
	@Column
	int unidadesStock;
	@Column
	@Temporal(TemporalType.DATE)
	Date fechaCreacion;
	@Column
	@Temporal(TemporalType.DATE)
	Date fechaActualizacion;
	@ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="categoria_id",referencedColumnName="id",nullable=false)
	private Categoria categoria;
	

}
