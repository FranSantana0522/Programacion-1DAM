package actividadAmpliacion8_29;

import java.math.BigDecimal;
import java.math.MathContext;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal x=new BigDecimal(2);
		System.out.println(x);
		BigDecimal raiz=x.sqrt(new MathContext(100));
		System.out.println(raiz);
	}

}
