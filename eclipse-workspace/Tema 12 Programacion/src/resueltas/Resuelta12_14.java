package resueltas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Resuelta12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Registro12_14> temperaturas=new LinkedHashSet<>();
		int opcion;
		do {
			System.out.println("1-Nuevo Registro\n2-Listar registros del dia\n3-Mostrar estadisticas\n4-Salir");
			opcion=new Scanner(System.in).nextInt();
			switch(opcion) {
			case 1->{
				System.out.println("Introduce la temperatura: ");
				double temperatura=new Scanner(System.in).useLocale(Locale.US).nextDouble();
				temperaturas.add(new Registro12_14(temperatura));
			}
			case 2 ->{
				System.out.println(temperaturas);
			}
			case 3->{
				Comparator<Registro12_14> c=new Comparator<Registro12_14>() {

					@Override
					public int compare(Registro12_14 o1, Registro12_14 o2) {
						// TODO Auto-generated method stub
						return (int)Math.signum(o1.temperatura-o2.temperatura);
					}
					
				};
				System.out.println("Maxima: "+Collections.max(temperaturas,c));
				System.out.println("Minima: "+Collections.min(temperaturas,c));
				double suma=0;
				for(Registro12_14 t: temperaturas) {
					suma+=t.temperatura;
				}
				System.out.println("Medio: "+suma/temperaturas.size());
			}
			case 4 ->{
				System.out.println("Has salido");
				String nombreArchivo="registros";
				DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyyMMdd");
				nombreArchivo+=LocalDate.now().format(f);
				try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(nombreArchivo))){
					out.writeObject(temperaturas);
				}catch(FileNotFoundException ex) {
					System.out.println(ex.getMessage());
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default ->{
				System.out.println("Elige opcion correcta");
			}
			}
		}while(opcion!=4);
	}

}
