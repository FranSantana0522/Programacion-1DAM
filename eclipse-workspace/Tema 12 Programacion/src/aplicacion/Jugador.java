package aplicacion;

import java.io.Serializable;

public class Jugador implements Serializable{
	private String DNI;
	private String nombre;
	private PosicionJug posi;
	private Double altura;
	
	
	public Jugador(String dNI, String nombre, PosicionJug posi, Double altura) {
		DNI = dNI;
		this.nombre = nombre;
		this.posi = posi;
		this.altura = altura;
	}
	public Jugador(PosicionJug pos) {
		this.posi=pos;
	}
	@Override
	public String toString() {
		return "Jugador [DNI=" + DNI + ", Nombre=" + nombre + ", Posicion=" + posi + ", Altura=" + altura + "]\n";
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PosicionJug getPosi() {
		return posi;
	}
	public void setPosi(PosicionJug posi) {
		this.posi = posi;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
