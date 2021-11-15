package ar.edu.unlam.videoclub;

public class TipoRomance extends Pelicula {

	public TipoRomance(String id, String titulo, String anio, TipoPelicula tipo) {
		super(id, titulo, anio, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esAlquilable() {
		return Boolean.FALSE;
	}

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.ROMANCE;
	}

}
