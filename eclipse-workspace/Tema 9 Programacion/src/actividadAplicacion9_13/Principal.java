package actividadAplicacion9_13;
import java.util.Arrays;
import java.util.Comparator;
public class Principal {
	
	public static void main(String[] args) {
		Futbolista [] t=new Futbolista[] {
			new Futbolista("12345678A","Juan Marquez",18,7),
			new Futbolista("87654321A","Lucia Rodriguez",24,5),
			new Futbolista("12345678C","Juan Marquito",23,10),
			new Futbolista("12345678B","Adrian Ruiz",18,8),
			new Futbolista("87654321Z","Roberto Romero",20,4)
		};
	System.out.println("Ordenado por dni: ");
	Arrays.sort(t);
	System.out.println(Arrays.deepToString(t));
	
	System.out.println("Ordenado por nombre: ");
	Comparator c1=new ComparaNombre();
	Arrays.sort(t,new ComparaNombre());
	System.out.println(Arrays.deepToString(t));
	
	System.out.println("Ordenado por edad: ");
	Comparator c2=new ComparaEdades();
	Arrays.sort(t,new ComparaEdades());
	System.out.println(Arrays.deepToString(t));
  }
}
