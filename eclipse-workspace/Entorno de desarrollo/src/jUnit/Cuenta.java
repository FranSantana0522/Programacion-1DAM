package jUnit;

public class Cuenta {
	private String numero;
	private float saldo;

	public Cuenta(String num, float cant) {
		this.numero = num;
		this.saldo = cant;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}
//Para un saldo de 100 el metodo get devuelve 100 
//1º Creamos una cuenta con saldo 100, 2º Invocamos a get, 3º Comparamos con 100
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void ingresarDinero(float cant) {
		this.saldo += cant;
	}

	public void extraerDinero(float cant) {
		this.saldo -= cant;
	}

	public void mostrarCuenta() {
		System.out.println("El saldo de la cuenta: " + numero + " es de " + saldo + "€");
	}
}