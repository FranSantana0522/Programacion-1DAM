package aplicacionAmpliacion9_28;

import java.util.Comparator;

public class CompararMinutos implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		return ((Jornada)ob1).minutosTrabajados()-((Jornada)ob2).minutosTrabajados();
	}

}
