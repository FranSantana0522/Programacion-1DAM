package packEjA15;

public class ActividadAplicacion7_15 {
	// implementar todos los metodos
	public static void main(String[] args) {
		Calendario f1 = new Calendario(2002, 8, 26);
		Calendario f2 = new Calendario(2004, 9, 30);
		if (f1.fechaCorrecta() == true) {
			f1.incrementarDia();
			
			f1.mostrar();
		} else {
			System.out.println("La fecha no es correcta");
		}
		if (f2.fechaCorrecta() == true) {
			f2.incrementarDia();
			f2.mostrar();
		} else {
			System.out.println("La fecha no es correcta");
		}

		System.out.println("Las fechas son iguales:" + f1.iguales(f2));

	}

}
