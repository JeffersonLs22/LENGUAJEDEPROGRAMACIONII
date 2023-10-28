package com.examen.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_libro")
public class Tb_Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_libro")
	private Long codLibro;

	@Column(name = "tit_libro")
	private String titLibro;

	@ManyToOne
	@JoinColumn(name = "cod_autor")
	private Tb_Autor autor;

	@Column(name = "fch_publicacion")
	private Date fchPublicacion;

	@ManyToOne
	@JoinColumn(name = "id_genero")
	private Tb_Genero genero;

	@Column(name = "descripcion")
	private String descripcion;

	public Tb_Libro() {
		super();
	}

	public Long getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(Long codLibro) {
		this.codLibro = codLibro;
	}

	public String getTitLibro() {
		return titLibro;
	}

	public void setTitLibro(String titLibro) {
		this.titLibro = titLibro;
	}

	public Tb_Autor getAutor() {
		return autor;
	}

	public void setAutor(Tb_Autor autor) {
		this.autor = autor;
	}

	public Date getFchPublicacion() {
		return fchPublicacion;
	}

	public void setFchPublicacion(Date fchPublicacion) {
		this.fchPublicacion = fchPublicacion;
	}

	public Tb_Genero getGenero() {
		return genero;
	}

	public void setGenero(Tb_Genero genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Tb_Libro{" + "codLibro=" + codLibro + ", titLibro='" + titLibro + '\'' + ", autor="
				+ autor.getNomAutor() + ", fchPublicacion=" + fchPublicacion + ", genero=" + genero.getDesGenero()
				+ ", descripcion='" + descripcion + '\'' + '}';
	}
}
