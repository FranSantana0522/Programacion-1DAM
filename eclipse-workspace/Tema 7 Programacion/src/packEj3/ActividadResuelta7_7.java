package packEj3;

public class ActividadResuelta7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Texto t=new Texto(5);
		t.addPrincipio("HO");
		t.addPrincipio(";");
		t.addFinal("LA");
		t.addFinal("X");
		t.mostrar();
		System.out.println("Numero de vocales: "+t.numVocales());
	}

}
