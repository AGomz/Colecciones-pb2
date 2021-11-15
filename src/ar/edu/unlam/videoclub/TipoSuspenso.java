package ar.edu.unlam.videoclub;

public class TipoSuspenso extends Pelicula implements  Comparable{

	public TipoSuspenso(String id, String titulo, String anio, TipoPelicula tipo) {
		super(id, titulo, anio, tipo);
		// TODO Auto-generated constructor stub
	}

	public Boolean esAlquilable() {
		Boolean sePuedeAlquilar = true;
		System.out.println("La pelicula" + this.getTitulo() + "se pudo alquilar");
		return sePuedeAlquilar;
	}
	
	/*REDEFINIR*/
	public Boolean esComparable() {
		Boolean esComparable=false;
		if(this.getTipo().equals(TipoPelicula.SUSPENSO)) {
			esComparable=true;
		}
		return esComparable;
	}

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.SUSPENSO;
	}

}
