package ar.edu.unlam.biblioteca;

public class LibroNoEncontradoException extends Exception {

	public LibroNoEncontradoException() {
		super("Libro no encontrado");
	}
}
