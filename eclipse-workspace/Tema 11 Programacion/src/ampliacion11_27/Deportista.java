package ampliacion11_27;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Deportista implements Serializable{
	public final String DNI;
	public String nombre;
	public LocalDate fechaNac;
	Deportes Deporte;
	
	
	public Deportista(String dNI, String nombre, String fechaNac, String depor) {
		DNI = dNI;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNac = LocalDate.parse(fechaNac, f);
		Deporte =deporte(depor);
	}
	public Deportes deporte(String depor) {
		Deportes deport=null;
		if(depor.equals("Natacion")) {
			deport=Deportes.Natacion;
		}else if(depor.equals("Remo")) {
			deport=Deportes.Remo;
		}else if(depor.equals("Vela")) {
			deport=Deportes.Vela;
		}else if(depor.equals("Waterpolo")) {
			deport=Deportes.Waterpolo;
		}
		return deport;
		
	}
	public int edad() {
		return (int) fechaNac.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	public String getDNI() {
		return DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNac = LocalDate.parse(fechaNac, f);
	}
	public Deportes getDeporte() {
		return Deporte;
	}
	public void setDeporte(String depor) {
		Deporte = deporte(depor);
	}
	
	
}
