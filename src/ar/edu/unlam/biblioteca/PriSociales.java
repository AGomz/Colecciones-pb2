package ar.edu.unlam.biblioteca;

public class PriSociales extends Libro implements Fotocopiable{

	public PriSociales(String codigoLibro, String nombreLibro, String autor, String editorial, Integer cantidadDeCopias,
			TipoNivel nivel, TipoMateria materia) {
		super(codigoLibro, nombreLibro, autor, editorial, cantidadDeCopias, nivel, materia);
		// TODO Auto-generated constructor stub
	}

	public Boolean sePuedeFotocopiar() {
		Boolean esFotocopiable = true;
		System.out.println("El libro de" + this.getNombreLibro() + "se fotocopi�");
		return esFotocopiable;
	}
}
