package actividadCoche;

public class Coche implements Comparable{
	String color,mat;
	Integer kilometraje;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(color.equals(((Coche)o).color)) {
			return mat.compareTo(((Coche)o).mat);
		}
		return color.compareTo(((Coche)o).color);
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", mat=" + mat + ", kilometraje=" + kilometraje + "]\n";
	}
	public Coche(String mat,String color, Integer kilometraje) {
		this.color = color;
		this.mat = mat;
		this.kilometraje = kilometraje;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public Integer getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	
}
