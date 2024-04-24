package packEj1;

public class ActividadResuelta7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente c ,c1,c2;
		Gestor g1=new Gestor("Antonio Gonzalez","666 555 444");
		Gestor g2=new Gestor("Bea Rodriguez","987 543  210",12000.0);
		c=new CuentaCorriente("12345678A","Pepe",g1);
		c1=new CuentaCorriente("99999999B","Ana",g1);
		c2=new CuentaCorriente("11222333C","Sancho");
		c.muestraInformacion();
		c1.muestraInformacion();
		c2.muestraInformacion();
		c1.setGestor(g2);
		c1.muestraInformacion();
		CuentaCorriente.setBanco("Banco Central");
		c.muestraInformacion();
		CuentaCorriente.setBanco("Caja de ahorros de Do-While");
		c.muestraInformacion();
		c1.muestraInformacion();
		c.ingreso(1000);
		c.egreso(300);
		System.out.println("Puedo sacar  700 euros: "+c.egreso(700));
		System.out.println("Puedo sacar 500 euros: "+c.egreso(500));
		c = new CuentaCorriente("98765432Z",2000);
		c.muestraInformacion();	
		c.dni= "1111111T";
		c.nombre="Antonio";
	}
	
}

