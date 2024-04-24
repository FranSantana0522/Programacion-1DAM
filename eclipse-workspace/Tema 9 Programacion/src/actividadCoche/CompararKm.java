package actividadCoche;

import java.util.Comparator;

public class CompararKm implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Coche)o1).kilometraje-((Coche)o2).kilometraje;
	}

}
