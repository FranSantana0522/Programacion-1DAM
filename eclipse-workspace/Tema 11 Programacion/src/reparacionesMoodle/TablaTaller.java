package reparacionesMoodle;

import java.util.Arrays;

public class TablaTaller {
Coche[] tabla = new Coche[0];


public TablaTaller() {
	
}

public TablaTaller(Coche[] tabla) {
	this.tabla = tabla;
}


public void insertar(Coche objeto) {
	tabla = Arrays.copyOf(tabla, tabla.length + 1);
	tabla[tabla.length - 1] = objeto;
}

@Override
public String toString() {
	return Arrays.toString(tabla);
}



}
