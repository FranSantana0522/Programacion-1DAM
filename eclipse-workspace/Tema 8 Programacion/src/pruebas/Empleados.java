package pruebas;

public class Empleados extends Persona{
	double salario;

	public Empleados() {
	
	}
	public Empleados(String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario = salario;
	}
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println(salario);
	}
}
