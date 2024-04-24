package actividadAplicacion8_13;

public class CajaCarton extends Caja{
	public double superficie;
	public CajaCarton() {
		super();
	}
	
	public CajaCarton(double ancho, double alto, double fondo,double volumen, Unidad unidad) {
		super(ancho, alto, fondo,volumen ,unidad);
		// TODO Auto-generated constructor stub
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	double getSuperficie(double ancho,double alto) {
		double superficie;
		superficie=ancho*alto;
		superficie=superficie*6;
		return superficie;
	}
	@Override
	double getVolumen(double ancho,double alto,double fondo) {
		super.getVolumen(ancho, alto, fondo);
		double volumen;
		volumen=ancho*alto*fondo;
		volumen=volumen*0.8;
		return volumen;
	}
	@Override
	public String toString() {
		return "CajaCarton [ancho=" + ancho + "cm, alto=" + alto + "cm, fondo=" + fondo +"cm, volumen="+volumen+"cm cubicos, superficie="+superficie +"cm cuadrados, etiqueta=" + etiqueta + "]";
	}
	
}
