package pack;

public class BoletinMoodle8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v=new int [100];
		int [] aux=new int [100];
		int longi=100;
		int impares=longi-1;
		int pares=0;
		for(int i=0;i<longi;i++) {
			v[i]=(int)(Math.random()*20);
		}
		for(int i=0;i<longi;i++) {
			if(v[i]%2==0) {
				aux[pares]=v[i];
				pares++;
			}else {
				aux[impares]=v[i];
				impares--;
			}
			
		}
		for(int i=0;i<longi;i++) {
			System.out.println(aux[i]);
		}
	}

}