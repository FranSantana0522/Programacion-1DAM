package pack;

public class BoletinRecursividad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]= {1,3,5,6};
		int i=0;
		int resultado=0;
		System.out.println("La suma total de vectores es: "+suma(v,i,resultado));
	}
	static int suma(int v[],int i, int resultado) {
		if(i==v.length) {
			return(resultado);
		}else {
			resultado=resultado+v[i];
			i++;
			return(suma(v,i,resultado));
		}
	}
}
