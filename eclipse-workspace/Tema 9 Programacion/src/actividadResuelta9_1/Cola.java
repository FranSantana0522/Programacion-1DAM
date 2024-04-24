package actividadResuelta9_1;

public interface Cola {
	void encolar(Integer o);
	Integer desencolar();
	default void encolarMultiple(Integer nuevo, int repe) {
		for(int i=0;i<repe;i++) {
			encolar(nuevo);
		}
	}
}
