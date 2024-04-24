package pack;

import java.util.Scanner;

public class ActividadResuelta3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado, operando1, operando2;
		int numOperaciones = 0;
		do {
			operando1 = (int) (Math.random()*100 +1);
			operando2 = (int) (Math.random()*100 +1);
			System.out.print(operando1+" + "+operando2+" = ");
			resultado= new Scanner(System.in).nextInt();
			numOperaciones++;
		}while (resultado ==operando1 + operando2);
		System.out.println("A conseguido realizar: " + (numOperaciones -1) + " sumas consecutivas");
		
	}

}
