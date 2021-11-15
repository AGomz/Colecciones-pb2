package ar.edu.unlam.videoclub;

public class TipoComedia extends Pelicula implements  Comparable{

	public TipoComedia(String id, String titulo, String anio, TipoPelicula tipo) {
		super(id, titulo, anio, tipo);
		// TODO Auto-generated constructor stub
	}

	public Boolean esAlquilable() {
		Boolean sePuedeAlquilar = true;
		System.out.println("La pelicula" + this.getTitulo() + "se pudo alquilar");
		return sePuedeAlquilar;
	}
	
	/*redefinir*/
	public Boolean esComparable() {
		Boolean esComparable=false;
		if(this.getTipo().equals(TipoPelicula.COMEDIA)) {
			esComparable=true;
		}
		return esComparable;
	}


	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.COMEDIA;
	}
	
}
