package ar.edu.unlam.biblioteca;

public class LibroNoFotocopiableException extends Exception {

	public LibroNoFotocopiableException() {
		super("No se puede fotocopiar este libro");
	}
}
