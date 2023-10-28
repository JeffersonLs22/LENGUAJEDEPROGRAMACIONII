package com.examen.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_autor")
public class Tb_Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_autor")
	private Long codAutor;

	@Column(name = "nom_autor")
	private String nomAutor;

	@Column(name = "descripcion")
	private String descripcion;

	@OneToMany(mappedBy = "autor")
	private List<Tb_Libro> libros;

	public Tb_Autor() {
		super();
	}

	public Long getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(Long codAutor) {
		this.codAutor = codAutor;
	}

	public String getNomAutor() {
		return nomAutor;
	}

	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Tb_Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Tb_Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Tb_Autor{" + "codAutor=" + codAutor + ", nomAutor='" + nomAutor + '\'' + ", descripcion='" + descripcion
				+ '\'' + '}';
	}
}
