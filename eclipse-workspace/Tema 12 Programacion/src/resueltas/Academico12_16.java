package resueltas;

public class Academico12_16 implements Comparable<Academico12_16>{
	String nombre;
	int aIngreso;
	
	public Academico12_16(String nombre, int aIngreso) {
		this.nombre = nombre;
		this.aIngreso = aIngreso;
	}

	@Override
	public int compareTo(Academico12_16 o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.nombre);
	}

	@Override
	public String toString() {
		return "Academico[Nombre=" + nombre + ", Año ingreso=" + aIngreso + "]\n";
	}

}
