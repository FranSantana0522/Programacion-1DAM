package ejemploBurbujaConSocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio {
	private static Integer idSocio=1;
	private final Integer idSocioSum;
	private String nombre;
	private LocalDate fechaAdmision;
	
	
	public Socio(String nombre, String fechaAdmision) {
		this.idSocioSum = idSocio;
		idSocio++;
		this.nombre = nombre;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAdmision = LocalDate.parse(fechaAdmision,f);
	}
	int antiguedad() {
		return (int) fechaAdmision.until(LocalDate.now(), ChronoUnit.YEARS);
	}	
	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocioSum + ", nombre=" + nombre + ", fechaAdmision=" + fechaAdmision
				+ ", Antiguedad=" + antiguedad() + "]\n";
	}
	public Integer getIdSocio() {
		return idSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaAdmision() {
		return fechaAdmision;
	}
	public void setFechaAdmision(String fechaAdmision) {
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAdmision = LocalDate.parse(fechaAdmision,f);
	}
	
	
}
