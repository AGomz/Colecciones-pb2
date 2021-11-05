package ar.edu.unlam.biblioteca;

public class SecGeografia extends LibrosSecundaria implements Fotocopiable{

	public SecGeografia(String codigoLibro, String nombreLibro, String autor, String editorial,
			Integer cantidadDeCopias, TipoNivel nivel) {
		super(codigoLibro, nombreLibro, autor, editorial, cantidadDeCopias, nivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean fotocopiar(Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

}
