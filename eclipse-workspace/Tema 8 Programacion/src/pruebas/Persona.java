package pruebas;

public class Persona {
	String nombre;
	int edad;
	double estatura;
	public void mostrar() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
	}
	public Persona(String nombre, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	public Persona() {
		super();
	}
	
}


