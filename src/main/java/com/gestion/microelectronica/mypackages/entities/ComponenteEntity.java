package com.gestion.microelectronica.mypackages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="componentes")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="nro_pieza")
	private String nroPieza;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="descripcion") 
	private String descripcion;
	
	@Column(name="fabricante")
	private String fabricante;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="precio")
	private double precio;
	

}
