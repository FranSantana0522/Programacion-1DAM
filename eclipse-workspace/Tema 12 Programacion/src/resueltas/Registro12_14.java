package resueltas;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro12_14 implements Serializable{
	LocalTime hora;
	double temperatura;
	public Registro12_14(double temperatura) {
		this.temperatura = temperatura;
		this.hora=LocalTime.now();
	}
	public boolean equals(Object o) {
		return hora.equals(((Registro12_14)o).hora);
	}
	@Override
	public String toString() {
		return "Registro12_14 [hora=" + hora + ", temperatura=" + temperatura + "ºC]\n";
	}
	
	
}
