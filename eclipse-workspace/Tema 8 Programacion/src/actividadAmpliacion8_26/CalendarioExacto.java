package actividadAmpliacion8_26;

import java.util.Objects;

public class CalendarioExacto extends Calendario{
	public int h,m;

	
	
	@Override
	public boolean fechaCorrecta() {
		// TODO Auto-generated method stub
		if (h>=0&&h<24) {
			if(m>=0&&m<64) {
				return super.fechaCorrecta();
			}
		}else {
			return false;
		}
		return false;
	}
	public void incrementarHora() {
		h++;
		if(h>24) {
			h=0;
			dia++;
		}
	}
	public CalendarioExacto(int año, int mes, int dia,int h,int m) {
		super(año, mes, dia);
		// TODO Auto-generated constructor stub
		this.h=h;
		this.m=m;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return super.toString()+" h=" + h + ", m=" + m + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalendarioExacto other = (CalendarioExacto) obj;
		return h == other.h && m == other.m;
	}
	
	
}
