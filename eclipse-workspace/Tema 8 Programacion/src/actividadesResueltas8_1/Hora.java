package actividadesResueltas8_1;

public class Hora {
	protected int hora,minutos;

	public Hora(int hora, int minutos) {
		this.hora = 0;
		this.minutos = 0;
		if(!setHora(hora)) {
			System.out.println("La hora es incorrecta");
		}
		if(!setMinutos(minutos)) {
			System.out.println("Los minutos no son validos");
		}
	}
	public void inc() {
		minutos++;
		if(minutos>59) {
			minutos=0;
			hora++;
			if(hora>23) {
				hora=0;
			}
		}
	}
	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean correcto=false;	
		if(0<=hora&&hora<24) {
			this.hora=hora;
			correcto=true;
		}
		return correcto;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean correcto=false;
		if(0<=minutos&&minutos<60) {
			this.minutos=minutos;
			correcto=true;
		}
		return correcto;
	}
	@Override
	public String toString() {
		String result;
		result=hora+":"+minutos;
		return result;
	}
}
