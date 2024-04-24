package pack;

public class ActividadResuelta4_9 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int max= maximo(2,9,7);
			System.out.println("El mayor es: "+ max);
		}
		static int maximo(int a, int b, int c) {
			int aux = maximo(a,b);
			return(maximo(aux,c));
		}
		static int maximo(int a,int b) {
			int max;
			if(a>b) {
				max=a;
			}else {
				max=b;
			}
			return(max);
		
	
	
	}
  
}
