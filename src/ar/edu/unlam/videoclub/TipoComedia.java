package ar.edu.unlam.videoclub;

public class TipoComedia extends Pelicula implements  Comparable, Alquilable{

	public TipoComedia(String id, String titulo, String anio, TipoPelicula tipo) {
		super(id, titulo, anio, tipo);
		// TODO Auto-generated constructor stub
	}

	
	public Boolean alquilar() {
		Boolean sePuedeAlquilar = false;
		if(this.comparar()) {
			sePuedeAlquilar = true;
		}
		return sePuedeAlquilar;
	}
	
	public Boolean comparar() {
		Boolean esComparable=false;
		if(this.getTipo().equals(TipoPelicula.COMEDIA)) {
			esComparable=true;
		}
		return esComparable;
	}
	
	/*Modo simple
	public Boolean alquilar() {
		Boolean sePuedeAlquilar = true;
		return sePuedeAlquilar;
	}
	
	public Boolean comparar() {
		Boolean esComparable=true;
		return esComparable;
	}*/

	/*@Override
	public Boolean alquilar(Pelicula pelicula) {
		Boolean sePuedeAlquilar = false;
		if(pelicula.getTipo().equals(TipoPelicula.COMEDIA)){
			sePuedeAlquilar = true;
		}
		return sePuedeAlquilar;
	}*/
}
