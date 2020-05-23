package gt.edu.umg.progra1.nododoble;

public class ListaNodoDoble {
	
	private NodoDoble principio, fin;
	
	public ListaNodoDoble() {
		principio=fin=null;
	}
	
	public boolean Vacia() {
		return principio == null;
		
	}
	
	public void agregarPrincipio(String dato) {
		if (!Vacia()) {
			
			principio = new NodoDoble(String dato);
			principio.siguiente.anterior=principio;
		
		} else {
			principio=fin = new NodoDoble(dato);

		}
	}

	
	public void agregarFinal(String dato) {
		if (!Vacia()) {
			
			fin = new NodoDoble(dato, null, fin);
			fin.anterior.siguiente=fin;
		
		} else {
			principio=fin = new NodoDoble(dato);

		}
	}
	
	public void listarNodoDoble() {
		
		
	}

}
