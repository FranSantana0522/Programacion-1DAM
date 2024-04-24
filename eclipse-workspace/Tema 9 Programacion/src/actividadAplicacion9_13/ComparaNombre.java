package actividadAplicacion9_13;

import java.util.Comparator;

public class ComparaNombre implements Comparator {
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		return ((Futbolista) ob1).nombre.compareTo(((Futbolista) ob2).nombre);
	}
}
