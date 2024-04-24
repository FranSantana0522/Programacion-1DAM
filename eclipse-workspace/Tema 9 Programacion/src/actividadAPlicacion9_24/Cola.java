package actividadAPlicacion9_24;

public interface Cola {
	void encolar(Object o);
	Object desencolar();
	default void encolarMultiple(Object nuevo, int repe) {
		for(int i=0;i<repe;i++) {
			encolar(nuevo);
		}
	}
}
