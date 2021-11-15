package ar.edu.unlam.videoclub;

public class TipoTerror extends Pelicula{

	public TipoTerror(String id, String titulo, String anio, TipoPelicula tipo) {
		super(id, titulo, anio, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esAlquilable() {
		return Boolean.FALSE;
	}

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.TERROR;
	}

}
