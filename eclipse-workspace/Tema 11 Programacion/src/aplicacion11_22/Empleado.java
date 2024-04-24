package aplicacion11_22;

import java.io.Serializable;

public class Empleado implements Serializable {
	public String dni;
	public String nombre;
	public Integer sueldo;

	public Empleado() {

	}

	public Empleado(String dni, String nombre, Integer sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public void setId(String dni) {
		this.dni = dni;
	}

	public String getId() {
		return dni;
	}

	@Override
	public String toString() {
		return "Empleados [DNI=" + dni + ", Nombre=" + nombre + ", Sueldo=" + sueldo + "]\n";
	}

}