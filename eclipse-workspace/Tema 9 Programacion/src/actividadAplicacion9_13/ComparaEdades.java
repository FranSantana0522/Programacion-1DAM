package actividadAplicacion9_13;

import java.util.Comparator;

public class ComparaEdades implements Comparator {

	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		if(((Futbolista)ob1).edad==((Futbolista)ob2).edad) {
			return ((Futbolista)ob1).nombre.compareTo(((Futbolista)ob2).nombre);
		}
		return ((Futbolista) ob1).edad - ((Futbolista) ob2).edad;
	}
}
