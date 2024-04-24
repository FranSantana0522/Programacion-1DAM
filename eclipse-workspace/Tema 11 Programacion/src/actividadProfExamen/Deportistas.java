package actividadProfExamen;

public class Deportistas {
	public String name;
	public Integer edad;
	public Double peso;
	public Double altura;
	
	public Deportistas(String name, Double peso) {
		this.name = name;
		this.peso = peso;
	}
	
	public Deportistas(String name, Integer edad, Double altura) {
		this.name = name;
		this.edad = edad;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Deportistas [Nombre=" + name + ", Edad=" + edad + ", Peso=" + peso + ", Altura=" + altura + "]\n";
	}

	
	
}
