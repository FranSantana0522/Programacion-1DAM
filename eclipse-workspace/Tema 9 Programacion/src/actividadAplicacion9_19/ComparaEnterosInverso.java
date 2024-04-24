package actividadAplicacion9_19;

import java.util.Comparator;

public class ComparaEnterosInverso implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		return -((Integer)ob1 -(Integer)ob2);
	}

}
