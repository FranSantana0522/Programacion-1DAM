package actividadAmpliacion8_25;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(3,2);
		Punto p2=new Punto(1,1);
		System.out.println(p1.toString()+"]");
		System.out.println(p2.toString()+"]");
		System.out.println("Distancis: "+p1.distancia(p2));
		System.out.println("Son iguales: "+p1.equals(p2));
		
		System.out.println();
		
		Punto3D p3=new Punto3D(3,2,3);
		Punto3D p4=new Punto3D(1,1,1);
		System.out.println(p3.toString()+"]");
		System.out.println(p4.toString()+"]");
		System.out.println("Distancia: "+p3.distancis(p4));
		System.out.println("Son iguales: "+p3.equals(p4));
		
		System.out.println();
		
		Punto p5=new Punto(5,5);
		Punto p6=new Punto(5,5);
		System.out.println(p5.toString()+"]");
		System.out.println(p6.toString()+"]");
		System.out.println("Distancis: "+p5.distancia(p6));
		System.out.println("Son iguales: "+p5.equals(p6));
		
		System.out.println();
		
		Punto3D p7=new Punto3D(9,9,9);
		Punto3D p8=new Punto3D(9,9,9);
		System.out.println(p7.toString()+"]");
		System.out.println(p8.toString()+"]");
		System.out.println("Distancia: "+p7.distancis(p8));
		System.out.println("Son iguales: "+p7.equals(p8));
		
		System.out.println();
		
		Suceso p9=new Suceso(2,5,2,9);
		Suceso p10=new Suceso(2,5,2,9);
		System.out.println(p9.toString());
		System.out.println(p10.toString());
		System.out.println("Son iguales: "+p9.equals(p10));
		
		System.out.println();
		
		Suceso p11=new Suceso(2,2,5,6);
		Suceso p12=new Suceso(7,1,6,5);
		System.out.println(p11.toString());
		System.out.println(p12.toString());
		System.out.println("Son iguales: "+p11.equals(p12));
		
	}

}
