package packEjA15;

public class Calendario {
	private int año;
	private int mes;
	private int dia;
	final int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	Calendario(int año, int mes, int dia) {
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	public boolean fechaCorrecta() {
		boolean correcto = false;
		if (año > 0) {
			if (mes > 0 && mes <= 12) {
				if (dia > 0 && dia <= diaMes[mes]) {
					correcto = true;
				}
			}
		} else {
			correcto = false;
		}

		return correcto;
	}

	void incrementarDia() {
		dia++;
		if (dia > diaMes[mes]) {
			dia = 1;
			mes++;
		}

	}

	void incrementarMes() {
		mes++;
		if (mes > 12) {
			mes = 1;
			año++;
		}

	}

	void incrementarAño(int cantidad) {
		año += cantidad;
	}

	void mostrar() {
		System.out.println("Fecha:" + dia + "/" + mes + "/" + año);
	}

	boolean iguales(Calendario otra) {
		boolean igual = false;
		if (año == otra.año && mes == otra.mes && dia == otra.dia) {
			igual = true;
		}
		return igual;
	}

}
