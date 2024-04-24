package actividadAplicacion8_14;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista l1=new Lista();
		Lista l2=new Lista();
		l1.insertarFinal(4);
		l1.insertarFinal(5);
		l1.insertarFinal(6);
		System.out.println(l1.toString());
		l1.insertarPrincipio(3);
		l1.insertarPrincipio(2);
		l1.insertarPrincipio(1);
		System.out.println(l1.toString());
		l1.insertar(2, 99);
		System.out.println(l1.toString());
		l1.eliminar(2);
		System.out.println(l1.toString());
		System.out.println(l1.buscar(4));
		l2.insertarFinal(10);
		l2.insertarFinal(20);
		l2.insertarFinal(30);
		l2.insertarFinal(40);
		l2.insertarFinal(50);
		System.out.println(l2.toString());
		l1.insertarFinal(l2);
		System.out.println(l1.toString());
		System.out.println(l1.equals(l2)); 
		Lista l3=new Lista();
		Lista l4=new Lista();
		l3.insertarFinal(10);
		l3.insertarFinal(20);
		l3.insertarFinal(30);
		l3.insertarFinal(40);
		l3.insertarFinal(50);
		l4.insertarFinal(10);
		l4.insertarFinal(20);
		l4.insertarFinal(30);
		l4.insertarFinal(40);
		l4.insertarFinal(50);
		System.out.println(l3.toString());
		System.out.println(l4.toString());
		System.out.println(l3.equals(l4)); 
		Conjunto c1=new Conjunto();	
		Conjunto c2=new Conjunto();
		c1.insertar(1);
		c1.insertar(2);
		c2.insertar(2);
		c2.insertar(1);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c2.insertar(1);
		 boolean isEqual = c1.equals(c2);
	        if (isEqual) {
	            System.out.println("Las listas son iguales");
	        }
	        else {
	            System.out.println("Las listas no son iguales");
	        }
	}

}
