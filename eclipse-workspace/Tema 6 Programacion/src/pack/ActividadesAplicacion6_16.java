package pack;

import java.util.Scanner;

public class ActividadesAplicacion6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char conjunto1[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','r','s','t','u','v','w','x','y','z'};
		char conjunto2[]= {'1','!','|','"','2','·','#','$','3','%','½','&','¬','/','{','4','[',')',']','=','5','}','@','~','(','?'};
		char[] traducir=new char[conjunto1.length];
		System.out.print("Dime una palabra:");
		String frase=sc.nextLine();
		frase= frase.toLowerCase();//Pasamos a minusculas
		//quitamos los espacios
		//cogemos cada caracter de la frase
		for(int i=0;i<frase.length();i++) {
		traducir[i]=traductor(conjunto1,conjunto2,frase.charAt(i));
		//en lugar de c lo ponemos inicializado(char.Art(i))
		//cada caracter de frase lo pasamos por el metodo, que pasara el mismo caracter
		//traducido o el caracter tal cual
		}
		//mostramos la nueva cadena traducida
		System.out.println(traducir);
		}
		static char traductor(char [] conjunto1, char [] conjunto2,char c) {
		//ES MUY SIMILAR A LA RESUELTA6.11
		//tenemos una frase en alfabetico(conjunto2) y pasamos a conjunto1
		char traducido;//Declaramos una variable que devolveremos en caso de que se traduzca
		String cjto1=String.valueOf(conjunto1);//pasamos el string array a string
		String cjto2=String.valueOf(conjunto2);
		int pos=cjto1.indexOf(c);
		if(pos==-1) {
		traducido=c;
		}else {
		traducido=conjunto2[pos];
		}
		return traducido;
	}
}
	