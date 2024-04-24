package actividadAmpliacion8_26;

public class ActividadAplicacion7_15 {
	// implementar todos los metodos
	public static void main(String[] args) {
		Calendario f1 = new Calendario(2002, 8, 26);
		Calendario f2 = new Calendario(2004, 9, 30);
		if (f1.fechaCorrecta() == true) {
			f1.incrementarDia();
			
			System.out.println(f1.toString()+"]");
		} else {
			System.out.println("La fecha no es correcta");
		}
		if (f2.fechaCorrecta() == true) {
			f2.incrementarDia();
			System.out.println(f2.toString()+"]");
		} else {
			System.out.println("La fecha no es correcta");
		}

		System.out.println("Las fechas son iguales:" + f1.equals(f2));

		CalendarioExacto f3=new CalendarioExacto(2004,7,21,6,00);
		CalendarioExacto f4=new CalendarioExacto(2005,4,15,8,00);
		if(f3.fechaCorrecta()==true) {
			f3.incrementarHora();
			f3.incrementarHora();
			System.out.println(f3.toString());
		}else {
			System.out.println("La fecha no es correcta");
		}
		if(f4.fechaCorrecta()==true) {
			System.out.println(f4.toString());
		}else {
			System.out.println("La fecha no es correcta");
		}
		System.out.println("Las fechas son iguales: "+f3.equals(f4));
	}

}
//BigDecimal   MathContext();