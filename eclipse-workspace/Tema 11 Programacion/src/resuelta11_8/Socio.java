package resuelta11_8;

import java.io.*;
/**
 * Clase socio
 * <h1>Entidad Principal</h1>
 * <b>3 de Mayo de 2023</b>
 * @author Francisco
 * @version 1.0
 * 
 */
public class Socio implements Serializable{
	/**
	 * Atributo DNI
	 */
	String dni;
	/**
	 * Atributo nombre
	 */
	String nombre;
	/**
	 * Constructor por parametros de un socio
	 * @param dni: valor del identificador del socio
	 * @param nombre: valor del nombre del socio
	 */
	public Socio(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	/**
	 * @return Cadena de la informacion de un socio
	 */
	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + "]\n";
	}
	
}
