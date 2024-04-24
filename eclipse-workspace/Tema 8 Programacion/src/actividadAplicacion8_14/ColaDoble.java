package actividadAplicacion8_14;

import java.util.Arrays;

public class ColaDoble extends Cola{
	Integer [] tabla=new Integer[0];
	
	public void encolarPrincipio(Integer n) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
		tabla[0]=n;
	}
	public Integer desencolarFinal() {
	Integer eliminado=null;
	eliminado=tabla[tabla.length];
		tabla=Arrays.copyOf(tabla, tabla.length-1);
		return eliminado;
	}
	
	
}
