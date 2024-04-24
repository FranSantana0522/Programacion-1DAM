package aplicacionAmpliacion9_31;

import java.util.Comparator;

public class CompararCoste implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Llamada)o1).coste()-((Llamada)o2).coste();
	}

}
