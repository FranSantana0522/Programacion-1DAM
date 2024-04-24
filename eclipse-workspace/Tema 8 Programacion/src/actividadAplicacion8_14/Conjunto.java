package actividadAplicacion8_14;

import java.util.Objects;

public class Conjunto extends Lista {

	public Conjunto() {
		super();
	}

	public void insertar(Integer nuevo) {
		if (super.buscar(nuevo) == -1) {
			super.insertarFinal(nuevo);
		} else {
			System.out.println("Ya esta introducido el " + nuevo);
		}

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean igual=false;
		int cont=0;
		Conjunto c2=(Conjunto) obj;
		for(int i=0;i<this.tabla.length;i++) {
			for(int j=0;j<c2.tabla.length;j++){
			
				if(this.tabla[i]==c2.tabla[j]) {
					cont++;
				}
			}
		}
		if(cont==c2.tabla.length) {
			igual=true;
		}
		
		return igual;	
	
	}
	@Override
	public String toString() {
		return "Conjunto [" + super.toString() + "]";
	}

}
