package packProyecto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import packEjPALumnos.Alumno;
import packEjPALumnos.Clase;

public class Asociacion {

	Socio [] asociacion=new Socio[0];
	//Proyecto de personas para una asociacion
	// almacenaremos los siguientes datos de una persona: nombre y fecha de nacimiento
	// cuando cada nuevo socio se da de alta se le asigna un codigo de asociado unico 
	// de forma automatica 
	// Crear un menu con las siguientes opciones: Alta de socio, 
	// Modificacion de fecha (Para ello pedir el numero de socio), Listado completo,
	// Listado completo ordenado por nombre, Listado completo ordenado por fecha de nacimiento
	//  y Salir 

	
	public Asociacion(){
		
	}
	public Asociacion(Socio[] asociacion) {
		this.asociacion = asociacion;
	}
	public Socio[] getAsociacion() {
		return asociacion;
	}
	public void setAsociacion(Socio[] asociacion) {
		this.asociacion = asociacion;
	}
	@Override
	public String toString() {
		return "Asociacion [asociacion=" + Arrays.toString(asociacion);
	}
	public void alta() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		String nombre=sc.next();
		System.out.println("Introduce fecha nacimiento: ");
		String fecha=sc.next();
		LocalDate fecha1=LocalDate.parse(fecha);
		this.asociacion=Arrays.copyOf(this.asociacion, this.asociacion.length+1);
		this.asociacion[this.asociacion.length-1]=new Socio(nombre,fecha1);
		
	}
	public void modificarFecha(Socio socio ) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<asociacion.length;i++) {
			if(asociacion[i].getCod()==socio.getCod()) {
				System.out.println("Modifica fecha nacimiento: ");
				String fecha=sc.next();
				LocalDate fecha1=LocalDate.parse(fecha);
				asociacion[i].setFecha(fecha1);
			}
		}
	}
	public void listadoCompleto() {
		for(int i=0;i<this.asociacion.length;i++) {
			System.out.println(this.asociacion[i].toString());
		}
	}
	public void listOrdNombre() {
		Asociacion claseAux=new Asociacion(this.asociacion);
		for(int i=0;i<claseAux.asociacion.length;i++) {
			for(int j=0;j<claseAux.asociacion.length;j++) {
				if(claseAux.asociacion[i].getNombre().compareToIgnoreCase(claseAux.asociacion[j].getNombre())<0) {
					Socio aux=new Socio();
					aux=claseAux.asociacion[i];
					claseAux.asociacion[i]=this.asociacion[j];
					claseAux.asociacion[j]=aux;
				}
			}
		}
		for(int i=0;i<claseAux.asociacion.length;i++) {
			System.out.println(claseAux.asociacion[i].toString());
		}
	}
	public void listOrdFecha() {
		Asociacion claseAux=new Asociacion(this.asociacion);
		for(int i=0;i<claseAux.asociacion.length;i++) {
			for(int j=0;j<claseAux.asociacion.length;j++) {
				if(claseAux.asociacion[i].getFecha().compareTo(claseAux.asociacion[j].getFecha())>0) {
					Socio aux=new Socio();
					aux=claseAux.asociacion[i];
					claseAux.asociacion[i]=this.asociacion[j];
					claseAux.asociacion[j]=aux;
				}
			}
		}
		for(int i=0;i<claseAux.asociacion.length;i++) {
			System.out.println(claseAux.asociacion[i].toString());
		}
	}
}
