package pack;

public class ActividadAplicacion4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=segundosTotal(4,14,33);
		System.out.println("El numero total de segundos: "+total);
	}
	static int segundosTotal(int d,int h,int m) {
		int s;
		h=d*24;
		m=h*60;
		s=m*60;
		return(s);
	}
}
