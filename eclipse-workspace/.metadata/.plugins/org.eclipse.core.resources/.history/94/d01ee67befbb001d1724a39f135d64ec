package packEjA11;

public class MarcaPagina {
	public static boolean empezarInicio=false;
	private int paginaAct;
	MarcaPagina(int paginas){
		this.paginaAct=paginas;
	}
	public void mostrarPag() {
		System.out.println("Estas en la pagina "+paginaAct);
	}
	public int empezarInicio() {
		paginaAct=1;
		return paginaAct;
	}
	public void pasarPagina() {
		if(paginaAct>=100) {
			paginaAct=1;
		}else {
			paginaAct++;
		}
	}
}
