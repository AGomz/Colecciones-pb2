package ar.edu.unlam.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Blockbuster {

	private List<Pelicula> peliculas;
	private List<Consola> consolas;
	private List<Alquiler> alquileres;
	
	private final Integer CANT_DISPONIBLE_PELIS = 5;
	private final Integer CANT_DISPONIBLE_CONS = 3;
	private Integer stockPeliculas;
	private Integer stockConsolas;
	private List<Cliente> clientes;
	
	public Blockbuster() {
		peliculas = new ArrayList<Pelicula>();
		consolas = new ArrayList<Consola>();
		alquileres = new ArrayList<Alquiler>();
		
		this.stockPeliculas = 0;
		this.stockConsolas = 0;
		clientes = new ArrayList<Cliente>();
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}

	public Integer obtenerCantidadDePeliculas() {
		Integer cantidad = this.peliculas.size();
		return cantidad;
	}

	public void alquilarConsola(Alquiler alquiler) {
		if(this.stockConsolas < this.CANT_DISPONIBLE_CONS) {
			this.alquileres.add(alquiler);
			this.stockConsolas--;
		}
	}

	public void devolverConsola(Consola consola) {
		this.stockPeliculas++;
	}
	
	public Boolean alquilarCondicionada(Pelicula pelicula, Cliente cliente) {
		Boolean resultado = false;
		if(cliente.esMayorDeEdad() && pelicula.getTipo().equals(TipoPelicula.CONDICIONADAS)) {
			
			resultado = true;
		}
		return resultado;
	}

	/*public Boolean alquilarPelicula(Alquiler alquiler) {
		Boolean resultado = false;
		if(this.stockPeliculas < this.CANT_DISPONIBLE_PELIS) {
			this.alquileres.add(alquiler);
			this.stockPeliculas--;
			resultado = true;
		}
		return resultado;
	}*/
	
	public void devolverPelicula(Alquiler alquiler) {
		this.stockPeliculas++;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public Boolean comprarPelicula(Pelicula pelicula) {
		Boolean sePudoComprar = false;
		peliculas.remove(pelicula);
		
		return sePudoComprar;
	}

	private Pelicula buscarPelicula(String idPelicula) throws PeliculaNoEncontradaException {
		for(Pelicula peliculaBuscada : this.peliculas) {
			if(peliculaBuscada.getId().equals(idPelicula)) {
				return peliculaBuscada;
			}
		}
		throw new PeliculaNoEncontradaException();
	}
	
	public Boolean alquilarPelicula(Cliente cliente, Pelicula pelicula) throws PeliculaNoEncontradaException, PeliculaNoAlquilableException {
		Alquiler alquiler;
		Pelicula peliculaEncontrada = buscarPelicula(pelicula.getId());
		if(peliculaEncontrada.esAlquilable()) {
			if(peliculaEncontrada.getTipo().equals(TipoPelicula.ACCION) || peliculaEncontrada.getTipo().equals(TipoPelicula.COMEDIA) || peliculaEncontrada.getTipo().equals(TipoPelicula.SUSPENSO)) {
				alquiler = new Alquiler(pelicula.getId(), null, cliente.getNroSocio());
				this.alquileres.add(alquiler);
				return Boolean.TRUE;
			}
			if(peliculaEncontrada.getTipo().equals(TipoPelicula.CONDICIONADAS) && cliente.esMayorDeEdad()) {
				alquiler = new Alquiler(pelicula.getId(), null, cliente.getNroSocio());
				this.alquileres.add(alquiler);
				return Boolean.TRUE;
			}
		}
			throw new PeliculaNoAlquilableException();	
	}
	
	public Integer getStockPeliculas() {
		return stockPeliculas;
	}

	public void setStockPeliculas(Integer stockPeliculas) {
		this.stockPeliculas = stockPeliculas;
	}

	public Integer getStockConsolas() {
		return stockConsolas;
	}

	public void setStockConsolas(Integer stockConsolas) {
		this.stockConsolas = stockConsolas;
	}
	
	
}
