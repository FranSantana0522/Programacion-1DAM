package packCoches;

public class Coche {
	String matricula;
	String color;

	public Coche(String matricula, String color) {
	this.matricula = matricula;
	this.color = color;
	}

	public String getMatricula() {
	return matricula;
	}
	public void setMatricula(String matricula) {
	this.matricula = matricula;
	}
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}

	public String toString() {
	return "Coche [matricula=" + matricula + ", color=" + color + "]";
	}
}

