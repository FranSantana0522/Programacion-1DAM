package aplicacion11_20;

import java.io.Serializable;

public class Clientes implements Serializable {
	public Integer id=1;
	public String nombre;
	public Integer tlf;
	
	public Clientes() {

	}

	public Clientes(String nombre, Integer tlf) {
		this.nombre = nombre;
		this.tlf = tlf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTlf() {
		return tlf;
	}

	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", tlf=" + tlf + "]\n";
	}

}
