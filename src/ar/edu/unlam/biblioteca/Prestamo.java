package ar.edu.unlam.biblioteca;

public class Prestamo {

	private Estudiante dniEstudiante;
	private Libro codigoLibro;
	
	//Un prestamo tiene un dni y un codgo
	public Prestamo(String dniEstudiante, String codigoLibro) {
		this.dniEstudiante = new Estudiante(dniEstudiante);
		this.codigoLibro = new Libro(codigoLibro); 
	}

	private Estudiante estudiante;
	private Libro libro;
	
	//Un prestamo usa un dni y un cdigo
	/*public Prestamo(Estudiante estudiante, Libro libro) {
		this.estudiante = estudiante;
		this.libro = libro;
	}*/
	
	public Boolean esValido() {
		Boolean resultado = false;
		if(this.getEstudiante().getTipo().equals(this.getLibro().getNivel())) {
			resultado = true;
		}
		return resultado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
}
