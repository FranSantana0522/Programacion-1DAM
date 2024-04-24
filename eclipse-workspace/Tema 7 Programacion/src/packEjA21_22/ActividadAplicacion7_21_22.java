package packEjA21_22;

public class ActividadAplicacion7_21_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto cjto1 = new Conjunto();
		Conjunto cjto2 = new Conjunto();

		cjto1.insertar(5);
		cjto1.insertar(4);
		cjto2.insertar(7);
		cjto2.insertar(10);
		cjto2.insertar(15);
		cjto1.muestra();
		cjto2.muestra();
		cjto1.insertar(cjto2);
		cjto1.muestra();
		cjto1.eliminarConjunto(cjto2);
		cjto1.muestra();
		cjto1.eliminarElemento(4);
		cjto1.muestra();
		System.out.println(cjto1.incluido(cjto1, cjto2));
		System.out.println(cjto1.union(cjto1, cjto2));
		System.out.println(cjto1.diferencia(cjto1, cjto2));

	}

}
