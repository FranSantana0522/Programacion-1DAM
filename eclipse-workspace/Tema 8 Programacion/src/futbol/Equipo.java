package futbol;

import java.util.Arrays;
import java.util.Scanner;

public class Equipo {
	Jugador[] conjJugador = new Jugador[0];
	String nombre;
	Integer presupuesto;

	public Equipo(Jugador[] conjJugador, String nombre, Integer presupuesto) {
		super();
		this.conjJugador = conjJugador;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public Equipo(String nombre, Integer presupuesto) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Equipo() {
		super();
	}

	public Jugador[] getConjJugador() {
		return conjJugador;
	}

	public void setConjJugador(Jugador[] conjJugador) {
		this.conjJugador = conjJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}
	public void altaJugadorEquipo(Jugador jug) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		String name = sc.next();
		System.out.println("Introduce DNI: ");
		String dni = sc.next();
		System.out.println("Introduce nacionalidad: ");
		String nac = sc.next();
		conjJugador=Arrays.copyOf(conjJugador, conjJugador.length+1);
		conjJugador[conjJugador.length-1]=new Jugador(name,dni,nac);	
	}

	@Override
	public String toString() {
		return "\nEquipo\n Nombre=" + nombre + ", presupuesto="
				+ presupuesto +"\n jugadores=" + Arrays.toString(conjJugador) + ""+"\n";
	}
	
}
