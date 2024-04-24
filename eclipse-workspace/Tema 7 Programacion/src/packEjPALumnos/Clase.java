package packEjPALumnos;

import java.util.Arrays;
import java.util.Scanner;

public class Clase {
	
	private Alumno[] clase=new Alumno[0];

	public Clase() {
		
	}

	public Clase(Alumno[] clase) {
		super();
		this.clase=clase;
	}
	public Alumno[] getClase() {
		return clase;
	}
	public void setClase(Alumno[] clase) {
		this.clase=clase;
	}
	public void introducirAlumno() {
		Scanner sc=new Scanner(System.in);
		Alumno aux=new Alumno();
		System.out.println("Introduce nombre: ");
		aux.setNombre(sc.next());
		this.clase=Arrays.copyOf(this.clase, this.clase.length+1);
		this.clase[this.clase.length-1]=aux;

	}
	public void introducirNotas(Alumno alumno) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<clase.length;i++) {
			if(clase[i].getNombre().equals(alumno.getNombre())) {
				int n1, n2, n3;
				System.out.println("Introduce la primera nota: ");
				n1=sc.nextInt();
				System.out.println("Introduce la segunda nota: ");
				n2=sc.nextInt();
				System.out.println("Introduce la tercera nota: ");
				n3=sc.nextInt();
				Integer notas[]= {new Integer(n1),new Integer(n2),new Integer(n3)};
				clase[i].setNotas(notas);
				
			}
		}
		
	}
	public void listOrdNombre() {
		Clase claseAux=new Clase(this.clase);
		for(int i=0;i<claseAux.clase.length;i++) {
			for(int j=0;j<claseAux.clase.length;j++) {
				if(claseAux.clase[i].getNombre().compareToIgnoreCase(claseAux.clase[j].getNombre())<0) {
					Alumno aux=new Alumno();
					aux=claseAux.clase[i];
					claseAux.clase[i]=this.clase[j];
					claseAux.clase[j]=aux;
				}
			}
		}
		for(int i=0;i<claseAux.clase.length;i++) {
			System.out.println(claseAux.clase[i].toString());
		}
	}
	public void listOrdNotas() {
		Clase claseAux=new Clase(this.clase);
		Double notMedia[]=new Double[this.clase.length];
		for(int i=0;i<claseAux.clase.length;i++){
			notMedia[i]=claseAux.clase[i].media();
		}
		for(int i=0;i<notMedia.length;i++) {
			for(int j=0;j<notMedia.length;j++) {
				if(notMedia[i]<notMedia[j]) {
					Double aux=new Double(notMedia[i]);
					notMedia[i]=notMedia[j];
					notMedia[j]=aux;
					Alumno auxA=new Alumno();
					auxA=claseAux.clase[i];
					claseAux.clase[i]=this.clase[j];
					claseAux.clase[j]=auxA;
				}
			}
		}
		
		for(int i=0;i<claseAux.clase.length;i++) {
			System.out.println(this.clase[i].toString());
		}
	}
	public void listOrdAsignatura2() {
		for(int i=0;i<clase.length;i++) {
			System.out.println("Nombre: "+clase[i].getNombre()+", Notas: "+clase[i].getNotas()[1]);
		}
	}
	public void listCompleto() {
		for(int i=0;i<this.clase.length;i++) {
			System.out.println(this.clase[i].toString());
		}
	}
}
