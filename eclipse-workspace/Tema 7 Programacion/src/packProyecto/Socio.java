package packProyecto;

import java.time.LocalDate;

public class Socio {
	private int cod=0;
	private String nombre;
	private LocalDate fecha;
	static int numSocios=0;
	
	public Socio() {
		
	}

	public Socio(int cod) {
		this.cod = cod;
	}

	public Socio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		numSocios++;
		this.cod=numSocios;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Socio [cod=" + cod + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	
	
}
