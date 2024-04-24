package pack;

public class ActividadResuelta4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int operacion=1;operacion<=4;operacion++) {
			double resultado=calculadora(5.0, 4.0, operacion);	
			System.out.println(resultado);
		}
	}
	static double calculadora(double a, double b,int operacion) {
		double result;
		result=switch(operacion) {
		case 1->
			a+b;
		case 2->
			a-b;
		case 3->
			a*b;
		case 4->
			(double)a/b;
			default->{
			System.out.println("Operacion no valida");
			yield 0;
			}
		};
		return(result);
	}

}
