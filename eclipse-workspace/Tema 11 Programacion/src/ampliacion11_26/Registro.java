package ampliacion11_26;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable{
	public Double tempMax;
	public Double tempMin;
	public LocalDate fecha;
	
	
	public Registro(Double tempMax, Double tempMin, String fecha) {
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fecha = LocalDate.parse(fecha, f);
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double variacion() {
		return this.tempMax-this.tempMin;
	}
	@Override
	public String toString() {
		return "Registro [Fecha=" + fecha + ", TempMax=" + tempMax + ", TempMin=" + tempMin +", Variacion="
				+ variacion() + "]\n";
	}
	
	
	
	
	
}
