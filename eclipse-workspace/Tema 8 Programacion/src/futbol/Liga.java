package futbol;

import java.util.Arrays;
import java.util.Scanner;

public class Liga {
	Equipo [] conjEq=new Equipo[0];

	
	
	public Liga() {
		super();
	}



	public Liga(Equipo[] conjEq) {
		super();
		this.conjEq = conjEq;
	}



	public Equipo[] getConjEq() {
		return conjEq;
	}



	public void setConjEq(Equipo[] conjEq) {
		this.conjEq = conjEq;
	}
	
	
	
	@Override
	public String toString() {
		return "Liga\n" + Arrays.toString(conjEq) + "";
	}



	public void altaEquipo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		String name=sc.next();
		System.out.println("Introduce presupuesto: ");
		Integer prep=sc.nextInt();
		conjEq=Arrays.copyOf(conjEq, conjEq.length+1);
		conjEq[conjEq.length-1]=new Equipo(name,prep);
		
	}
	public int busqueda(Equipo equip) {
		boolean real=false;
		Integer pos=-1;
		for(int i=0;i<this.conjEq.length&&!real;i++) {
			if(conjEq[i].getNombre().equals(equip.getNombre())) {
				pos=i;
				real=true;
			}
		}
		return pos;
		
	}
	public void añadirJugadorE(Integer pos,Jugador jug) {
		conjEq[pos].altaJugadorEquipo(jug);
	}
	public void modPresupuesto(Integer pos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Presupuesto nuevo: ");
		Integer prep=sc.nextInt();
		conjEq[pos].setPresupuesto(prep);
		
	}
	public void compOrdNombreEq() {
		Liga ligAux=new Liga(this.conjEq);
		for(int i=0;i<ligAux.conjEq.length;i++) {
			for(int j=0;j<ligAux.conjEq.length;j++) {
				if(ligAux.conjEq[i].getNombre().compareToIgnoreCase(ligAux.conjEq[j].getNombre())<0) {
					Equipo aux=new Equipo();
					aux=ligAux.conjEq[i];
					ligAux.conjEq[i]=this.conjEq[j];
					ligAux.conjEq[j]=aux;
				}
			}
		}
		
			System.out.println(ligAux.toString());
		
	}
	
	public void compOrdPresupuesto() {
		Liga ligAux=new Liga(this.conjEq);
		for(int i=0;i<ligAux.conjEq.length;i++) {
			for(int j=0;j<ligAux.conjEq.length;j++) {
				if(ligAux.conjEq[i].getPresupuesto().compareTo(ligAux.conjEq[j].getPresupuesto())>0) {
					Equipo aux=new Equipo();
					aux=ligAux.conjEq[i];
					ligAux.conjEq[i]=this.conjEq[j];
					ligAux.conjEq[j]=aux;
				}
			}
		}
	
			System.out.println(ligAux.toString());
		
	}




	
}
