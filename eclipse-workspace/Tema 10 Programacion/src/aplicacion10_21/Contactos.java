package aplicacion10_21;

public class Contactos implements Comparable {
	public String name;
	public Integer tlf;

	public Contactos(String name, Integer tlf) {
		super();
		this.name = name;
		this.tlf = tlf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTlf() {
		return tlf;
	}

	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}
	
	@Override
	public String toString() {
		return "Contactos [Nombre=" + name + ", tlf=" + tlf + "]\n";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return name.compareTo(((Contactos) o).name);
	}

}
