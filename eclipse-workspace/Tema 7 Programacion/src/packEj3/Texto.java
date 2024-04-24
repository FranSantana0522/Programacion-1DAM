package packEj3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
	private String cad;
	LocalDate creacion;
	LocalDateTime ultimaModificacion;
	private final int Longitud_MAX;
	static final String VOCALES="aeiouáéíóú";
	
	public Texto(int longitudMax) {
		cad="";
		this.Longitud_MAX=longitudMax;
		creacion=LocalDate.now();
		ultimaModificacion=null;
	}
	
	public void addFInal(char c) {
		if(Longitud_MAX>cad.length()) {
			cad=cad+c;
			ultimaModificacion=LocalDateTime.now();
		}
	}
	
	public void addFinal(String c) {
		if(Longitud_MAX>=cad.length()+c.length()) {
			cad=cad+c;
			ultimaModificacion=LocalDateTime.now();
		}
	}
	
	public void addPrincipio(char c) {
		if(Longitud_MAX>cad.length()) {
			cad=c+cad;
			ultimaModificacion=LocalDateTime.now();
		}
	}
	
	public void addPrincipio(String c) {
		if(Longitud_MAX>=cad.length()+c.length()) {
			cad=c+cad;
			ultimaModificacion=LocalDateTime.now();
		}
	}
	public void mostrar() {
		System.out.println("Texto creado el "+creacion);
		System.out.println("Ultima modificacion: "+ultimaModificacion);
		System.out.println(cad);
	}
	
	public int numVocales() {
		int voc=0;
		for(int i=0;i<cad.length();i++) {
			if(esVocal(cad.charAt(i))) {
				voc++;
			}
		}
		return voc;
	}
	
	private boolean esVocal(char c) {
		boolean vocal=false;
		c=Character.toLowerCase(c);
		if(VOCALES.indexOf(c)!=1) {
			vocal=true;
		}
		return vocal;
	}
}
