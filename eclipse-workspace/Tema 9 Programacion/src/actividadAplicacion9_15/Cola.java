package actividadAplicacion9_15;

public interface Cola {
	void encolar(String o);
	String desencolar();
	default void encolarMultiple(String nuevo, int repe) {
		for(int i=0;i<repe;i++) {
			encolar(nuevo);
		}
	}
}
