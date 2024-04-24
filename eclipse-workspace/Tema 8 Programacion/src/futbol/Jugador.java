package futbol;

public class Jugador {
	public String dni,nombre,nacionalidad;

	
	
	public Jugador() {
		super();
	}

	public Jugador(String dni, String nombre, String nacionalidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "dni=" + dni + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
}
