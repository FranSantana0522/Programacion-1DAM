package aplicacionAmpliacion9_31;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llamada [] t=new Llamada[] {
			new Llamada(523346544,999999999,true,"21-07-2023","09:30","09:45",Tarifas.Low),
			new Llamada(328957323,888888888,true,"02-02-2023","10:30","11:00",Tarifas.LessLow),
			new Llamada(409723892,888888888,true,"23-04-2023","08:00","10:00",Tarifas.Hight),
			new Llamada(384572633,777777777,false,"15-08-2023","07:05","07:15",Tarifas.Medium),
			new Llamada(523346544,999999999,true,"21-07-2023","09:46","10:16",Tarifas.LessHigh)
		};
		System.out.println(Arrays.deepToString(t));
		Arrays.sort(t);
		System.out.println(Arrays.deepToString(t));
		
		System.out.println("Lista: ");
		Lista a=new Lista();
		a.insertarFinal(new Llamada(523346544,999999999,true,"21-07-2023","09:30","09:45",Tarifas.Low));
		a.insertarFinal(new Llamada(328957323,888888888,true,"02-02-2023","10:30","11:00",Tarifas.LessLow));
		a.insertarFinal(new Llamada(409723892,888888888,true,"23-04-2023","08:00","10:00",Tarifas.Hight));
		a.insertarFinal(new Llamada(384572633,777777777,false,"15-08-2023","07:05","07:15",Tarifas.Medium));
		a.insertarFinal(new Llamada(523346544,999999999,true,"20-07-2023","09:30","10:00",Tarifas.LessHigh));
		System.out.println(a);
		Arrays.sort(a.tabla);
		System.out.println(a);
		
		System.out.println("Por coste: ");
		Comparator c=new CompararCoste();
		Arrays.sort(a.tabla,c);
		System.out.println(a);
	}

}
