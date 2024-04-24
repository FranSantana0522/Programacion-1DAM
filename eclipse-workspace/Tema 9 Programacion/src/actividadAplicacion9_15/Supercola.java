package actividadAplicacion9_15;

public class Supercola {
	public int[] cola1;
	public int[] cola2;
	public int tamaño1;
	public int tamaño2;
	public int frente1;
	public int frente2;
	public int final1;
	public int final2;

	public Supercola(int capacidad) {
		cola1 = new int[capacidad];
		cola2 = new int[capacidad];
		tamaño1 = 0;
		tamaño2 = 0;
		frente1 = 0;
		frente2 = 0;
		final1 = -1;
		final2 = -1;
	}

	public void encolarEnCola1(int valor) {
		if (final1 == cola1.length - 1) {
			System.out.println("La cola 1 está llena");
		} else {
			final1++;
			cola1[final1] = valor;
			tamaño1++;
			System.out.println(valor + " ha sido encolado en la cola 1");
			mostrarEstado();
		}
	}

	public void encolarEnCola2(int valor) {
		if (final2 == cola2.length - 1) {
			System.out.println("La cola 2 está llena");
		} else {
			final2++;
			cola2[final2] = valor;
			tamaño2++;
			System.out.println(valor + " ha sido encolado en la cola 2");
			mostrarEstado();
		}
	}

	public Integer desencolarDeCola1() {
		if (tamaño1 == 0) {
			System.out.println("La cola 1 está vacía");
			if (tamaño2 == 0) {
				System.out.println("Ambas colas están vacías");
				return null;
			} else {
				int valorDesencolado = cola2[frente2];
				frente2++;
				tamaño2--;
				System.out.println("\n"+valorDesencolado + " ha sido desencolado de la cola 2");
				mostrarEstado();
				return valorDesencolado;
			}
		} else {
			int valorDesencolado = cola1[frente1];
			frente1++;
			tamaño1--;
			System.out.println("\n"+valorDesencolado + " ha sido desencolado de la cola 1");
			mostrarEstado();
			return valorDesencolado;
		}
	}

	public Integer desencolarDeCola2() {
		if (tamaño2 == 0) {
			System.out.println("La cola 2 está vacía");
			if (tamaño1 == 0) {
				System.out.println("Ambas colas están vacías");
				return null;
			} else {
				int valorDesencolado = cola1[frente1];
				frente1++;
				tamaño1--;
				System.out.println("\n"+valorDesencolado + " ha sido desencolado de la cola 1");
				mostrarEstado();
				return valorDesencolado;
			}
		} else {
			int valorDesencolado = cola2[frente2];
			frente2++;
			tamaño2--;
			System.out.println("\n"+valorDesencolado + " ha sido desencolado de la cola 2");
			mostrarEstado();
			return valorDesencolado;
		}
	}

	public void mostrarEstado() {
		System.out.print("Cola 1: ");
		for (int i = frente1; i <= final1; i++) {
			System.out.print(cola1[i] + " ");
		}
		System.out.println("");
		System.out.print("Cola 2: ");
		for (int i = frente2; i <= final2; i++) {
			System.out.print(cola2[i] + " ");
		}
	}
}
