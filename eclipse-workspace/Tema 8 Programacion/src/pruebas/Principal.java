package pruebas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona e=new Persona("Sancho",25,1.80);
		e=new Empleados("Sancho",25,1.80,1324.34);
		e.mostrar();
		System.out.println();
		Persona p;
		p= new Persona();
		p.mostrar();
		p= new Empleados();
		p.mostrar();
		p= new Clientes();
		p.mostrar();
	}

}
