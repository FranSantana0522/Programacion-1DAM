package aplicacion;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio12_25 implements Comparable<Socio12_25>, Serializable {
	String dni;
	String nombre;
	LocalDate fechaAlta;

	public Socio12_25(String dni, String nombre, String fechaAlta) {
		this.dni = dni;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAlta = LocalDate.parse(fechaAlta,f);
	}

	public Socio12_25(String dni) {
		this.dni = dni;
	}

	public Socio12_25() {
		// TODO Auto-generated constructor stub
	}

	int antiguedad() {
		return (int) fechaAlta.until(LocalDate.now(),ChronoUnit.YEARS);
	}
	@Override
	public int compareTo(Socio12_25 o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.nombre);
	}
	
	public boolean equals(Object o) {
		return dni.equals(((Socio12_25)o).dni);
	}
	
	
	
	@Override
	public String toString() {
		return "Socio [DNI=" + dni + ", Nombre=" + nombre + ", Antiguedad=" + antiguedad() + " años ]\n";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	
	
	
	
	
	
	
}
