package resueltas;

public class Resuelta12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedor12_1<Integer> c = new Contenedor12_1<>(new Integer[0]);
		for (int i = 0; i < 20; i++) {
			c.insertarFinal((int) (Math.random() * 20));
		}
		System.out.println("Sin ordenar: " + c);
		c.ordenar();
		System.out.println("Ordenado:" + c);
		Integer n = c.extraerPrincipio();
		System.out.println("Elemento extraido: " + n);
		System.out.println("Despues de extraer: "+c);
	}

}
