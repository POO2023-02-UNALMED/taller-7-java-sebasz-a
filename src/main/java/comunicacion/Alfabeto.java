package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		}
	
	//getters and setters
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	//metodos abstractos heredados
	public String interpretacion() {
		return this.getInterpretacion();
	}
	public String toString() {
		String r = "";
		for (String letra : letras) {
			if (letra.equals(this.getLetras()[this.getLetras().length - 1])) {
				r += letra;
			}
			else {
				r += letra + ", ";
			}
		}
		return r;
	}
	//metodos de instancia
	public int cantidadLetras() {
		return this.letras.length;
	}
}
