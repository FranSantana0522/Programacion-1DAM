package pack;



public class ActividadAplicacion4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio=4;
		superficieVolumen(radio);
	}
	static void superficieVolumen(int radio) {
		double sup,vol;
		sup=4*Math.PI*Math.pow(radio, 2);
		System.out.println("La superficie es: "+sup);
		vol=((4*Math.PI)/3)*Math.pow(radio, 3);
		System.out.println("El volumen es: "+vol);
	}
}
