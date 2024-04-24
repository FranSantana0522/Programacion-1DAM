package pack;

import java.util.Scanner;

public class ActividadResuelta4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a calcular fibonacci(n)");
		System.out.println("Introduce un numero(recomendable n<40): ");
		int num=sc.nextInt();
		int resultado= fibo(num);
		System.out.println("\nfibonacci("+num+") = "+ resultado);
	}
	static int fibo(int num) {
		int res;
		if(num==0||num==1) {
			res=1;
		}else {
			res=fibo(num-1)+fibo(num-2);
		}
		return(res);
	}
}
