package aplicacion;

public class Aplicacion12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedor12_14 <Integer> lista=new Contenedor12_14<>(new Integer[0]);
		for(int i=0;i<30;i++) {
			lista.insertarFinal((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		lista.ordenar();
		System.out.println(lista);
		System.out.println("Coge el primer elemento: ");
		System.out.println(lista.get(0));
		System.out.println("Coge el 15 elemento: ");
		System.out.println(lista.get(14));
	}

}
