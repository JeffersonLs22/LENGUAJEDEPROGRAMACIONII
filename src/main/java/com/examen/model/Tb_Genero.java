package com.examen.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_genero")
public class Tb_Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private Long idGenero;

	@Column(name = "des_genero")
	private String desGenero;

	@OneToMany(mappedBy = "genero")
	private List<Tb_Libro> libros;

	public Tb_Genero() {
		super();
	}

	public Long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	public String getDesGenero() {
		return desGenero;
	}

	public void setDesGenero(String desGenero) {
		this.desGenero = desGenero;
	}

	public List<Tb_Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Tb_Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Tb_Genero{" + "idGenero=" + idGenero + ", desGenero='" + desGenero + '\'' + '}';
	}
}
