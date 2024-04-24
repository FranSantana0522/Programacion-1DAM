package actividadResuelta9_7;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio s2=new Socio(2,"Juan","23-07-2004");
		Socio s1=new Socio(3,"Fran","21-07-2004");
		Socio s3=new Socio(1,"Fran","13-03-2002");
		int r=s1.compareTo(s3);
		System.out.println(r);
		r=s1.compareTo(s2);
		System.out.println(r);
		r=s3.compareTo(s1);
		System.out.println(r);
		
		Socio [] ts= new Socio[]{
				new Socio(2,"Juan","23-07-2004"),
				new Socio(3,"Fran","21-07-2004"),
				new Socio(1,"Lola","13-03-2002")	
		};
		Arrays.sort(ts);
		System.out.println(Arrays.deepToString(ts));
		
		CompararNombre c=new CompararNombre();	
		Arrays.sort(ts,new CompararNombre());
		System.out.println(Arrays.deepToString(ts));
		
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
