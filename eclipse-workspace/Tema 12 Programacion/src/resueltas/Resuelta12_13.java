package resueltas;

public class Resuelta12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorteo12_13 <Integer> s=new Sorteo12_13<>();
		for(int i=0;i<100;i++) {
			s.add(i);
		}
		System.out.println(s);
		System.out.println("Premiados: "+s.premiados(20));
	}

}
