package ar.edu.unlam.biblioteca;

public class Prestamo {

	private String dniEstudiante;
	private String codigoLibro;
	
	public Prestamo(String dniEstudiante, String codigoLibro) {
		this.dniEstudiante = dniEstudiante;
		this.codigoLibro = codigoLibro; //O debería pasarle el constructor
	}

	public String getDniEstudiante() {
		return dniEstudiante;
	}

	public void setDniEstudiante(String dniEstudiante) {
		this.dniEstudiante = dniEstudiante;
	}

	public String getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}
	
}
