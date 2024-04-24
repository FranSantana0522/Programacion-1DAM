package pack;

public class BoletinRecursividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = { 22, 4, 5, 6, 20, 1 };
		int i=0;
		int max=0,min=0;
		maximo(v,i,max,min);
		
	}
	static void maximo(int v[], int i, int max, int min) {
		if(i==v.length) {
			System.out.println("El max "+ max);
			System.out.println(" ");
			System.out.println("El min "+min);
		}else {
			if(max<v[i]) {
				max=v[i];
			}
			if(min>v[i]) {
				min=v[i];
				maximo(v,i+1,max,min);
			}
		}
	}
}
