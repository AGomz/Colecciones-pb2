package ar.edu.unlam.biblioteca;

public class PriNaturales extends Libro implements Fotocopiable{

	public PriNaturales(String codigoLibro, String nombreLibro, String autor, String editorial,
			Integer cantidadDeCopias, TipoNivel nivel, TipoMateria materia) {
		super(codigoLibro, nombreLibro, autor, editorial, cantidadDeCopias, nivel, materia);
		// TODO Auto-generated constructor stub
	}

	public Boolean sePuedeFotocopiar() {
		Boolean esFotocopiable = true;
	    //this.prestamos.add(e)
		System.out.println("El libro de" + this.getNombreLibro() + "se fotocopió");
		this.setCantidadDeCopias(this.getCantidadDeCopias()-1);
		return esFotocopiable;
	}
}
