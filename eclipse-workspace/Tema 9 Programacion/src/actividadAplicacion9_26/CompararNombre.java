package actividadAplicacion9_26;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class CompararNombre implements Comparator{
	
	public int compare(Object ob1, Object ob2) {
			// TODO Auto-generated method stub
			return 	((Socio)ob1).nombre.compareTo(((Socio)ob2).nombre);
		}
		

}
