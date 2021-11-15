package ar.edu.unlam.videoclub;

public class PeliculaNoAlquilableException extends Exception {

	public PeliculaNoAlquilableException(){
		super("No se puede alquilar pelicula");
	}
}
