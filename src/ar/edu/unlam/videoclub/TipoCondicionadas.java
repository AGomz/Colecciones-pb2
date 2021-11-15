package ar.edu.unlam.videoclub;

public class TipoCondicionadas extends Pelicula implements Alquilable{

	Cliente cliente; 
	
	public TipoCondicionadas(String id, String titulo, String anio, TipoPelicula tipo, Cliente cliente) {
		super(id, titulo, anio, tipo);
		this.cliente = cliente;
	}

	@Override
	public Boolean esAlquilable() {
		Boolean sePuedeAlquilar = true;
		System.out.println("La pelicula" + this.getTitulo() + "se pudo alquilar");
		return sePuedeAlquilar;
	}

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.CONDICIONADAS;
	}

}
