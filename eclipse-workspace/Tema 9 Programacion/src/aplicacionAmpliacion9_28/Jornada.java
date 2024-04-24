package aplicacionAmpliacion9_28;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable{
	public String DNI;
	public LocalDate fecha;
	public LocalTime horaEntrada;
	public LocalTime horaSalida;
	
	public Jornada(String dNI, String fecha, String horaEntrada, String horaSalida) {
		DNI = dNI;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fecha = LocalDate.parse(fecha,f);
		DateTimeFormatter h=DateTimeFormatter.ofPattern("HH:mm");
		this.horaEntrada = LocalTime.parse(horaEntrada,h);
		DateTimeFormatter h2=DateTimeFormatter.ofPattern("HH:mm");
		this.horaSalida = LocalTime.parse(horaSalida,h2);
	}
	
	public int 	minutosTrabajados() {
		return (int)horaEntrada.until(horaSalida, ChronoUnit.MINUTES);
	}
	
	
	@Override
	public String toString() {
		return "Jornada [DNI=" + DNI + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida="
				+ horaSalida + ", minutos trabajados=" + minutosTrabajados() + "]\n";
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(DNI.equals(((Jornada)o).DNI)) {
			return fecha.compareTo(((Jornada)o).fecha);
		}
		return DNI.compareTo(((Jornada)o).DNI);
	}
	
	
	
	
	
}
