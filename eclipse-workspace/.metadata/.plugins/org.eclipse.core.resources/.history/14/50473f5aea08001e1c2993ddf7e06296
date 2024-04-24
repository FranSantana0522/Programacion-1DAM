package ejemploBurbujaConSocio;

import java.util.Arrays;
import java.util.Scanner;

public class TablaSocio {
	public Socio[] socio=new Socio[0];
	
	void InsercionOrdenacionSocioId() {
		// Metodo de la burbuja Insercion y ordenacion a la vez
		Scanner scanner = new Scanner(System.in);
			System.out.println("Nombre: ");
			String nombre = scanner.next();
			System.out.println("Fecha admision: ");
			String fecha = scanner.next();
			Socio c = new Socio(nombre, fecha);
			socio = Arrays.copyOf(socio, socio.length + 1);
			socio[socio.length-1] = c;
	}
	public Socio[] getSocio() {
		return socio;
	}
	public void setSocio(Socio[] socio) {
		this.socio = socio;
	}
	public TablaSocio() {

	}
	@Override
	public String toString() {
		return "TablaSocio \n" + Arrays.toString(socio) + "";
	}
	
	
	
}
