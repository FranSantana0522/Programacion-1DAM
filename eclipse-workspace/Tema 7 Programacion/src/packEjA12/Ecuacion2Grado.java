package packEjA12;

public class Ecuacion2Grado {	//Double.NaN el discriminante es negativo.
	double a, b, c;
	Ecuacion2Grado(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void resuelve() {
		double raiz;
		raiz=(this.b*this.b)-(4*this.a*this.c);
		if(raiz<0) {
			System.out.println("El discriminante es negativo");
		}else {
			System.out.println("El discriminante es positivo");
		}
	}
	public void solucion() {
		double raiz=((this.b*this.b)-(4*this.a*this.c));
		if(raiz<0) {
			System.out.println("No tiene solucion");
		}else {
			double solucion=(-b+Math.sqrt(raiz))/2*a;
			double solucion2=(-b-Math.sqrt(raiz))/2*a;
			if(solucion==solucion2) {
				System.out.println("Solo hay una solucion "+solucion);
			}else {
				System.out.println("Solucion sumando "+solucion);
				System.out.println("Solucion restando "+solucion2);
			}
		}
	}
}
