package aplicacionAmpliacion9_28;
	
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jornada []t=new Jornada[] {
				new Jornada("12345678D","22-04-2023","12:25","23:30"),
				new Jornada("12345678C","13-03-2023","10:26","21:30"),
				new Jornada("12345678B","14-10-2023","11:27","22:30"),
				new Jornada("12345678A","20-01-2023","11:28","22:30"),
				new Jornada("12345678A","02-02-2023","12:29","23:30"),
				
		};
		System.out.println(Arrays.deepToString(t));
		Arrays.sort(t);
		System.out.println(Arrays.deepToString(t));
		
		System.out.println("Lista de jornadas");
		Lista j=new Lista();
		j.insertarFinal(new Jornada("12345678D","22-04-2023","12:25","23:30"));
		j.insertarFinal(new Jornada("12345678C","13-03-2023","10:26","21:30"));
		j.insertarFinal(new Jornada("12345678B","14-10-2023","11:27","22:30"));
		j.insertarFinal(new Jornada("12345678A","20-01-2023","11:28","22:30"));
		j.insertarFinal(new Jornada("12345678A","02-02-2023","12:29","23:30"));
		System.out.println(j);
		
		Comparator c=new CompararMinutos();
		Arrays.sort(j.tabla,c);
		System.out.println(j);
	}

}
