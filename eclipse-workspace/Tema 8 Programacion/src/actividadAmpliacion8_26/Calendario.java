package actividadAmpliacion8_26;

public class Calendario {
	public int año;
	public int mes;
	public int dia;
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

	

	@Override
	public String toString() {
		return "Calendario [año=" + año + ", mes=" + mes + ", dia=" + dia +  "";
	}

	boolean equals(Calendario otra) {
		boolean igual = false;
		if (año == otra.año && mes == otra.mes && dia == otra.dia) {
			igual = true;
		}
		return igual;
	}

}
