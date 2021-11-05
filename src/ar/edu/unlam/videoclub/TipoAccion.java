package ar.edu.unlam.videoclub;

public class TipoAccion extends Pelicula implements  Comparable, Alquilable{

	public TipoAccion(String id, String titulo, String anio, TipoPelicula tipo) {
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
		if(this.getTipo().equals(TipoPelicula.ACCION)) {
			esComparable=true;
		}
		return esComparable;
	}
	/*public Boolean alquilar() {
		Boolean sePuedeAlquilar = true;
		return sePuedeAlquilar;
	}

	public Boolean comparar() {
		Boolean esComparable=true;
		return esComparable;
	}*/

}
