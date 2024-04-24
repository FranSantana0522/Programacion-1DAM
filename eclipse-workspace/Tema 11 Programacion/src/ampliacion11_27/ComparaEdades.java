package ampliacion11_27;

import java.util.Comparator;

public class ComparaEdades implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Deportista)o1).edad()-((Deportista)o2).edad();
	}

}
