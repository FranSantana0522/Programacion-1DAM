package resueltas;

import java.util.Arrays;

public class Contenedor12_3<T> implements Pila12_3<T> {
	private T[] object;

	public Contenedor12_3(T[] object) {
		this.object = object;
	}

	void insertarFinal(T nuevo) {
		object = Arrays.copyOf(object, object.length + 1);
		object[object.length - 1] = nuevo;
	}

	void insertarPrincipio(T nuevo) {
		object = Arrays.copyOf(object, object.length + 1);
		System.arraycopy(object, 0, object, 1, object.length - 1);
		object[0] = nuevo;
	}

	T extraerFinal() {
		T res = null;
		if (object.length > 0) {
			res = object[object.length - 1];
			object = Arrays.copyOf(object, object.length - 1);
		}
		return res;
	}

	T extraerPrincipio() {
		T res = null;
		if (object.length > 0) {
			res = object[0];
			object = Arrays.copyOfRange(object, 1, object.length);
		}
		return res;
	}
	
	void ordenar() {
		Arrays.sort(object);
	}
	public String toString() {
		return Arrays.deepToString(object);
	}

	@Override
	public void apilar(T nuevo) {
		// TODO Auto-generated method stub
		this.insertarPrincipio(nuevo);
	}

	@Override
	public T desapilar() {
		// TODO Auto-generated method stub
		return this.extraerPrincipio();
	}
}
