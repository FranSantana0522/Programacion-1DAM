package actividadAPlicacion8_21;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Object cadena="Nombre:";
	Object cadena2=" Fran";
	Object n1=3;
	Object n2=4;
	Object n3=3.5;
	Object n4=4.5;
	esNumero(n1);
	esNumero(cadena);
	sumar(cadena,cadena2);
	sumar(n1,n2);
	sumar(n3,n4);
	sumar(n1,cadena);
	sumar(cadena2,n3);
	}
	public static boolean esNumero(Object obj) {
		boolean numero=false;
		if(obj.getClass().getSuperclass().getName().equals("java.lang.Number")) {
				numero=true;
		}
		return numero;
	}
	public static boolean sumar(Object a, Object b) {
		if(a.getClass().getSuperclass().getName().equals("java.lang.Number")
			&&b.getClass().getSuperclass().getName().equals("java.lang.Number")) {
			if(a.getClass().getName().equals("java.lang.Integer")
					&&b.getClass().getName().equals("java.lang.Integer")) {
				Integer sumar=(Integer) a+(Integer)b;
				System.out.println(sumar);
			}else if(a.getClass().getName().equals("java.lang.Double")
					&&b.getClass().getName().equals("java.lang.Double")) {
				Double sumar=(Double) a+(Double)b;
				System.out.println(sumar);
			}
		}else if(a.getClass().getName().equals("java.lang.String")
				&&b.getClass().getName().equals("java.lang.String")) {
			System.out.println(""+a+b);
		}else {
			System.out.println("No sumables");
		}
		return true;
	}
}
