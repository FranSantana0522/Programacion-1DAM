package actividadAplicacion9_26;
import java.util.Comparator;
import java.util.Arrays;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio [] t2= new Socio[]{
				new Socio(2,"Juan","23-07-2004"),
				new Socio(3,"Fran","21-07-2004"),
				new Socio(1,"Fran","13-03-2002")
		};
		Arrays.sort(t2);
		System.out.println(Arrays.deepToString(t2));
		
		Socio [] ts= new Socio[]{
				new Socio(2,"Juan","23-07-2004"),
				new Socio(3,"Fran","21-07-2004"),
				new Socio(1,"Lola","13-03-2002")	
		};
		Arrays.sort(ts);
		System.out.println(Arrays.deepToString(ts));
		System.out.println("Por nombre:");
		Comparator c=new CompararNombre();	
		Comparator c4= c.reversed();
		Arrays.sort(ts,c4);
		System.out.println(Arrays.deepToString(ts));
		System.out.println("Por edad:");
		Comparator c1= new ComparaEdades();
		Comparator c2= c1.reversed();	
		Arrays.sort(ts,c2);
		System.out.println(Arrays.deepToString(ts));
		
		
		Integer [] tabla=new Integer[20];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*100+1);
		}
		Comparator c3=new ComparaEnterosInverso();
		Arrays.sort(tabla,c3);
		System.out.println(Arrays.deepToString(tabla));
		
	}

}
