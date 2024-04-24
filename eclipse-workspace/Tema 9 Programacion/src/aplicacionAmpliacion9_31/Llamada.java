package aplicacionAmpliacion9_31;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Llamada implements Comparable {
	public Integer telCliente;
	public Integer numInterlocutor;
	public Boolean llamadaSaliente;
	public LocalDate fecha;
	public LocalTime horaInicio;
	public LocalTime horaFin;
	Tarifas zonaInter;

	@Override
	public String toString() {
		return "Llamada [telCliente=" + telCliente + ", numInterlocutor=" + numInterlocutor + ", fecha=" + fecha
				+ ", horaInicio=" + horaInicio + ", duracion=" + minutosTrabajados() + ", coste llamada=" + coste()
				+ "$]\n";
	}

	public Llamada(Integer telCliente, Integer numInterlocutor, Boolean llamadaSaliente, String fecha,
			String horaInicio, String horaFin, Tarifas zonaInter) {
		this.telCliente = telCliente;
		this.numInterlocutor = numInterlocutor;
		this.llamadaSaliente = llamadaSaliente;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fecha = LocalDate.parse(fecha, f);
		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
		this.horaInicio = LocalTime.parse(horaInicio, h);
		DateTimeFormatter h2 = DateTimeFormatter.ofPattern("HH:mm");
		this.horaFin = LocalTime.parse(horaFin, h2);
		this.zonaInter = zonaInter;
	}

	public int minutosTrabajados() {
		return (int) horaInicio.until(horaFin, ChronoUnit.MINUTES);
	}

	public int coste() {
		if (llamadaSaliente == true) {
			if (zonaInter==Tarifas.Low) {
				return 1 * minutosTrabajados();
			} else if (zonaInter==Tarifas.LessLow) {
				return 2 * minutosTrabajados();
			} else if (zonaInter==Tarifas.Medium) {
				return 3 * minutosTrabajados();
			} else if (zonaInter==Tarifas.LessHigh) {
				return 4 * minutosTrabajados();
			} else if (zonaInter==Tarifas.Hight) {
				return 5 * minutosTrabajados();
			}
		}
		return 0;
	}

	public Integer getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(Integer telCliente) {
		this.telCliente = telCliente;
	}

	public Integer getNumInterlocutor() {
		return numInterlocutor;
	}

	public void setNumInterlocutor(Integer numInterlocutor) {
		this.numInterlocutor = numInterlocutor;
	}

	public Boolean getLlamadaSaliente() {
		return llamadaSaliente;
	}

	public void setLlamadaSaliente(Boolean llamadaSaliente) {
		this.llamadaSaliente = llamadaSaliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public Tarifas getZonaInter() {
		return zonaInter;
	}

	public void setZonaInter(Tarifas zonaInter) {
		this.zonaInter = zonaInter;
	}

	@Override
	public int compareTo(Object o2) {
		// TODO Auto-generated method stub
		if (telCliente == ((Llamada) o2).telCliente) {
			if(fecha==(((Llamada)o2).fecha)) { 
			return horaInicio.compareTo(((Llamada)o2).horaInicio);
			 }
			return fecha.compareTo(((Llamada)o2).fecha);
		}
		return telCliente - ((Llamada) o2).telCliente;
	}

}
