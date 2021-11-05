package ar.edu.unlam.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Blockbuster {

	private List<Pelicula> peliculas;
	private List<Consola> consolas;
	private List<Alquiler> alquileres;
	
	public Blockbuster() {
		peliculas = new ArrayList<Pelicula>();
		consolas = new ArrayList<Consola>();
		alquileres = new ArrayList<Alquiler>();
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}

	public Integer obtenerCantidadDePeliculas() {
		Integer cantidad = this.peliculas.size();
		return cantidad;
	}

	public Boolean agregarConsola(Consola consola) {
		Boolean resultado= false;;
		resultado = this.consolas.add(consola);
		return resultado;
	}

	public Boolean agregarAlquiler(Alquiler alquiler) {
		Boolean resultado = false;
		resultado = this.alquileres.add(alquiler);
		return resultado;
	}

	
}
