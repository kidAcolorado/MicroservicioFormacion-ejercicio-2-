package com.viewnext.kidaprojects.microservicioformacion.model;

import java.util.Objects;

/**
 * La clase {@code Formacion} representa información sobre una formación relacionada con un curso. Contiene detalles
 * como el nombre del curso, la cantidad de asignaturas y el precio de la formación.
 *
 * <p>El autor de esta clase es Víctor Colorado "Kid A".</p>
 *
 * @version 1.0
 * @since 3 de octubre de 2023
 */
public class Formacion {

	private String curso;
	private int asignaturas;
	private int precio;
	
	
	public Formacion(String curso, int asignaturas, int precio) {
		super();
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}


	public Formacion() {
		super();
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(curso);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formacion other = (Formacion) obj;
		return Objects.equals(curso, other.curso);
	}


	@Override
	public String toString() {
		return "Formacion [curso=" + curso + ", asignaturas=" + asignaturas + ", precio=" + precio + "]";
	}
	
	
	
	
}
