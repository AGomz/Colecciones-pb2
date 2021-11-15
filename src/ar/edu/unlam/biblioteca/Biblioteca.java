package ar.edu.unlam.biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

	private List<Libro> libros; 
	private List<Prestamo> prestamos;
	/*Los que tiene para prestar la biblioteca*/
	private final Integer CANT_COPIAS_PRESTAR=3;
	private Integer COPIA_LECTURA=1;
	
	/*Los que puede realizar el estudiante*/
	private final Integer CANT_MAX_PRESTAMOS=2;
	
	private Integer cantidadLibrosPrestados;
	private Integer cantidadDeCopias;
	
	public Biblioteca() {
		libros = new ArrayList<Libro>();
		prestamos = new ArrayList<Prestamo>();
		
		this.cantidadLibrosPrestados = 0;
		this.cantidadDeCopias = 0;
	}

	public Boolean agregarLibro(Libro nuevoLibro) {
		Boolean seAgrego = false;
		seAgrego = this.libros.add(nuevoLibro);
		return seAgrego;
	}
	
		public Boolean alquilarLibro(Prestamo prestamo) {
		Boolean resultado = false;
		
		//Si ambos tienen mismo nivel de educación
		if(prestamo.esValido() && this.cantidadLibrosPrestados<this.CANT_MAX_PRESTAMOS) {
			if(this.cantidadDeCopias<this.CANT_COPIAS_PRESTAR) {
				prestamos.add(prestamo);
				this.cantidadLibrosPrestados++;
				this.cantidadDeCopias--;
				resultado=true;
			 }
		 }
		return resultado;
	}
	
	//Devuelve true siempre que pueda imprimirse
	public Boolean fotocopiarLibro(String idLibro, String idCliente) throws LibroNoFotocopiableException, LibroNoEncontradoException{
			Boolean resultado=true;
			Prestamo prestamo;
			Libro libroEncontrado = buscarLibro(idLibro);
			/*Casteo + instanceof:
			 * libroEncontrado es de Libro por eso lo casteo para poder acceder a los metodos de esa clase, por ejemplo fotocopiar()
			 * Me permite conocer/llamar a los metodos de las clases 
			 * Si una de las clases no tiene ese metodo, da error*/
			if(libroEncontrado instanceof PriSociales) {
				
				((PriSociales)libroEncontrado).sePuedeFotocopiar();
				prestamo = new Prestamo(idLibro, idCliente);
				
			}else {
				throw new LibroNoFotocopiableException();
			}
			return resultado;	
	}
	
	private Libro buscarLibro(String idLibro) throws LibroNoEncontradoException {
		for(Libro libroBuscado : this.libros) {
			if(libroBuscado.getCodigoLibro().equals(idLibro)) {
				return libroBuscado;
			}
		}
		throw new LibroNoEncontradoException();
	}

	//puede ser Boolean
	public Integer devolverLibro(Prestamo prestamo) {
		prestamos.remove(prestamo);
		this.cantidadDeCopias++;
		return this.cantidadLibrosPrestados--;
	}

	public Integer getCantidadDeCopias() {
		return cantidadDeCopias;
	}

	public void setCantidadDeCopias(Integer cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}

	public Integer getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	public void setCantidadLibrosPrestados(Integer cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

}
