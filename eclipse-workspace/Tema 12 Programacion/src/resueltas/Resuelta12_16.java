package resueltas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Resuelta12_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Academico12_16> academia = new TreeMap<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Letra: ");
			Character letra = new Scanner(System.in).next().charAt(0);
			System.out.println("Nombre: ");
			String nombre = new Scanner(System.in).next();
			System.out.println("Año de ingreso: ");
			int ingreso = new Scanner(System.in).nextInt();
			nuevoAcademico(academia, new Academico12_16(nombre, ingreso), letra);
		}
		System.out.println("Orden por letra: " + academia);
		Collection<Academico12_16> sinLetra=academia.values();
		List <Academico12_16> listaSinLetra=new ArrayList<>(sinLetra);
		Collections.sort(listaSinLetra);
		System.out.println("Por nombre sin letra: "+listaSinLetra);
		Comparator<Academico12_16> comparaIngreso=new Comparator<>() {

			@Override
			public int compare(Academico12_16 o1, Academico12_16 o2) {
				// TODO Auto-generated method stub
				return o1.aIngreso-o2.aIngreso;
			}
			
		};
		Collections.sort(listaSinLetra,comparaIngreso);
		System.out.println("Por año sin letra: "+listaSinLetra);
		Set<Map.Entry<Character,Academico12_16>> conLetra=academia.entrySet();
		List<Map.Entry<Character, Academico12_16>> listaConLetra=new ArrayList<>(conLetra);
		Collections.sort(listaConLetra,new Comparator<>(){

			@Override
			public int compare(Entry<Character, Academico12_16> o1, Entry<Character, Academico12_16> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().aIngreso-o2.getValue().aIngreso;
			}
			
		});
		System.out.println("Orden por año de ingreso: "+listaConLetra);
		Collections.sort(listaConLetra,new Comparator<>() {

			@Override
			public int compare(Entry<Character, Academico12_16> o1, Entry<Character, Academico12_16> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		System.out.println("Orden por nombre: "+listaConLetra);
	}

	static boolean nuevoAcademico(Map<Character, Academico12_16> academia, Academico12_16 nuevo, Character letra) {
		boolean insertado = false;
		if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z') || letra == 'ñ' || letra == 'Ñ') {
			academia.put(letra, nuevo);
			insertado=true;
		}else {
			System.out.println("Letra no valida");
		}
		return insertado;
	}

}
