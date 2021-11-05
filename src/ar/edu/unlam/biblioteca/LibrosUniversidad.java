package ar.edu.unlam.biblioteca;

public class LibrosUniversidad extends Libro{

	public LibrosUniversidad(String codigoLibro, String nombreLibro, String autor, String editorial, Integer cantidadDeCopias, TipoNivel nivel) {
		super(codigoLibro, nombreLibro, autor, editorial, cantidadDeCopias, nivel);
		
	}
	
	//Debería agregar una colección para que puedan agregarse los libros de la clase hija

}
			