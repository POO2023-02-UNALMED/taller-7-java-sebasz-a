package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	//getters and setters
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	//metodos abstractos heredados
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 10;
	}
	
	//metodos de instancia
	public String interpretacion() {
		return this.getInterpretacion();
	}
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.fecha + "\n"
				+ this.primicia;
	}
}
