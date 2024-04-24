package packEjPALumnos;

import java.util.Arrays;

public class Alumno {
/*Menu de opciones       Son 3 clases en total esta  otra mas y el main


public class Clase {

1-Insertar alumno (void añadirAl (alumno)) (alta:nombre alumno)

2-Añadir notas (void añadirNotas(alumno)) (3 asignaturas |1,2,3) 
(Pedir nombre alumno al cual insertar notas) (int buscarAlumno(String))

3-Listado ORD alfabeticamente por nombre (void) 

4-Listado ORD nota media (void) { metodo double mediaAsignaturas() }
(dos arrays uno para notas y otro para las notas medias y ordenadas)

5-Listado de Alumnos con las calificaciones de la asignatura 2 (void)

6-Listado completo (void)(tal cual como se insertan en el array)

7-Salir

}

-Principal 
void main(){

Clase clase=new clase();


do{
	verMenu()

	swicht op:
	
	case 1:

}while();

}
*/
	
	private String nombre;
	private Integer[]notas;
	public Alumno() {
		this.nombre=new String();
		this.notas=new Integer[3];
	}
	public Alumno(String nombre) {
		this.nombre=nombre;
	}
	public Alumno(String nombre,Integer[]notas) {
		this.nombre=nombre;
		this.notas=notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Integer[] getNotas() {
		return notas;
	}
	public void setNotas(Integer[] notas) {
		this.notas=notas;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}
	public double media() {
		return ((this.notas[0]+this.notas[1]+this.notas[2])/3);
	}
	
}
