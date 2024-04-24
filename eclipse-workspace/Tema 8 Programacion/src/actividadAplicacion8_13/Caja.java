package actividadAplicacion8_13;

public class Caja {
	 public double ancho,alto,fondo,volumen;
	 public String etiqueta;
	 public Unidad unidad;

	 
	public Caja() {
		super();
	}

	public Caja(double ancho, double alto, double fondo,double volumen,Unidad unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.volumen=volumen;
		this.unidad=unidad;
		}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	double getVolumen(double ancho,double alto,double fondo) {
		double volumen;
		volumen=ancho*alto*fondo;
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho +" "+unidad +", alto=" + alto+" "+unidad + ", fondo=" + fondo +" "+unidad+", volumen="+volumen+" "+unidad+" cubicos"+ ", etiqueta=" + etiqueta + "]";
	}
	
}
