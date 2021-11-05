package ar.edu.unlam.biblioteca;

public class UnivCalcAvanzado extends LibrosUniversidad implements Fotocopiable{

	public UnivCalcAvanzado(String codigoLibro, String nombreLibro, String autor, String editorial,
			Integer cantidadDeCopias, TipoNivel nivel) {
		super(codigoLibro, nombreLibro, autor, editorial, cantidadDeCopias, nivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean fotocopiar(Libro libro) {
		// TODO Auto-generated method stub
		//Defino los tipos que se pueden fotocopiar con el enum y el atributo asignatura
		return null;
	}

}
