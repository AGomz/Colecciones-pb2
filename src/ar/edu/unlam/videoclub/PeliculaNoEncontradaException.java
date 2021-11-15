package ar.edu.unlam.videoclub;

public class PeliculaNoEncontradaException extends Exception {

	public PeliculaNoEncontradaException() {
		super("Pelicula no encontrada");
	}
}
