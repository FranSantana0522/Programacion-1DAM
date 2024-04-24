package packEjA14;

public class Compra {
	private final double[] cambios = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.2, 0.01 };
	int[] importe = new int[cambios.length];
	private double compra;
	double resultado;

	void cambio(double compra) {
		int pos = 0;
		while (compra > 0) {
			resultado = (int) (compra / cambios[pos]);
			if (resultado > 0) {
				importe[pos] = (int) resultado;
				compra -= resultado * cambios[pos];
			} else {
				pos++;
			}

		}
	}

	void mostrar() {
		System.out.println("Gasto:" + compra);
		System.out.println("Vueltas");
		for (int i = 0; i < importe.length; i++) {
			if (importe[i] > 0) {
				System.out.println(importe[i] + " de " + cambios[i]);
			}
		}
	}

}
