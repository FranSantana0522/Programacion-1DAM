package packEj1;

public class CuentaCorriente {
	
		String dni;
		public String nombre;
		private double saldo;
		static private String nombreBanco="International Java Bank";
		static void setBanco(String nuevoNombre) {
			nombreBanco=nuevoNombre;
		}
		static String getBanco() {
			return nombreBanco;
		}
		CuentaCorriente(String dni, String nombre){
			this.dni=dni;
			this.nombre=nombre;
			saldo=0;
		}
		CuentaCorriente(String dni, double saldo){
			this.dni=dni;
			this.saldo=saldo;
			this.nombre="Sin asignar";
		}
		CuentaCorriente(String dni ,String nombre ,double saldo){
			this.dni=dni;
			this.nombre=nombre;
			this.saldo=saldo;
		}
		boolean egreso(double cant) {
			boolean operacionPosible;
			if(saldo >= cant) {
				saldo-=cant;
				operacionPosible=true;
			}else {
				System.out.println("No hay dinero suficiente");
				operacionPosible=false;
			}
			return (operacionPosible);
		}
		void ingreso(double cant){
			saldo+= cant;
		}
		Gestor gestor;
		CuentaCorriente(String dni,String nombre,Gestor gestor){
			this(dni,nombre);
			this.gestor=gestor;
		}
		void setGestor(Gestor gestor) {
			this.gestor=gestor;
		}
		void muestraInformacion() {
			if(gestor==null) {
				System.out.println("Cuenta sin gestor");
			}else {
				System.out.println("-Informacion del gestor");
				gestor.muestraInformacion();
			}
			System.out.println("-Informacion de la cuenta");
			System.out.println("Nombre: "+nombre);
			System.out.println("Dni: "+dni);
			System.out.println("Saldo: "+saldo);
			System.out.println();
		}
}
