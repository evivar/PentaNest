package com.java.pentanest.business;

import java.text.SimpleDateFormat;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Atleta {

	// Atributos
	
	private StringProperty nombre;
	
	private StringProperty apellidos;
	
	private StringProperty club;
	
	private StringProperty sexo;
	
	private IntegerProperty nacimiento;
	
	private StringProperty categoria;
	
	private IntegerProperty dorsal;
	
	private StringProperty tiempoNatacion;
	
	/**
	 * Usar:
	 * 			Date date = format.parse(tiempoNatacion);
	 * Asi obtenemos un objeto tipo Date
	 */
	private SimpleDateFormat formatoDuracion = new SimpleDateFormat("mm:ss:SSS");
	
	// Constructores
	
	public Atleta() {
		
	}

	public Atleta(StringProperty nombre, StringProperty apellidos, StringProperty club, StringProperty sexo,
			IntegerProperty nacimiento, StringProperty categoria, IntegerProperty dorsal, StringProperty tiempoNatacion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.club = club;
		this.sexo = sexo;
		this.nacimiento = nacimiento;
		this.categoria = categoria;
		this.dorsal = dorsal;
		this.tiempoNatacion = tiempoNatacion;
	}
	
}
