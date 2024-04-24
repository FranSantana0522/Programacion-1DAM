package pack;

public class ActividadAplicacion4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosAmigos(220,284);
		
	}
	static void numerosAmigos(int a,int b) {
		int sumaA=0;
		int sumaB=0;
		for( int j = a-1; j>=1; j--) {
			if((a % j) == 0) {
				sumaA+=j;
			}
		}
		for( int j = b-1; j>=1; j--) {
			if((b % j) == 0) {
				sumaB+=j;
			}
		}
		if(sumaA==b && sumaB==a) {
			System.out.println(a+" y "+b+" son amigos");
		}else {
			System.out.println(a+" y "+b+" no son amigos");
		}
	}
	
}
