package ar.edu.unlam.biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

	private List<Libro> libros; 
	private List<Prestamo> prestamos;
	private final Integer CANT_COPIAS_PRESTAR=3;
	private Integer COPIA_LECTURA=1;
	private final Integer CANT_MAX_PRESTAMOS=2;
	
	//private Integer cantidadDePrestamos;
	
	public Biblioteca() {
		libros = new ArrayList<Libro>();
		prestamos = new ArrayList<Prestamo>();
		
		//this.cantidadDePrestamos = 0;
	}

	public void agregarLibro(Libro nuevoLibro) {
		this.libros.add(nuevoLibro);
	}
	
	public Boolean prestarLibro(Libro libroPedido, TipoNivel tipo, Prestamo libroPrestado) {
		Boolean sePudoPrestar = false;
		if(libroPedido.getNivel().equals(tipo)) {
			//REVISAR
			if(libroPedido.getCantidadDeCopias()>this.COPIA_LECTURA && libroPedido.getCantidadDeCopias()<=this.CANT_COPIAS_PRESTAR) {
				libroPedido.setCantidadDeCopias(libroPedido.getCantidadDeCopias()-1); 
				prestamos.add(libroPrestado);
				sePudoPrestar=true;
			}
		}
		return sePudoPrestar;
	}
	
	public Boolean pedirLibro(Estudiante alumno) {
		Boolean sePudoPedir=false;
		Integer cantidadPrestamos=0;
		
		for(Prestamo prestamo: this.prestamos) {
			if(prestamo.getDniEstudiante().equals(alumno.getDocumento()) && cantidadPrestamos<this.CANT_MAX_PRESTAMOS) {
				cantidadPrestamos++;
				sePudoPedir=true;
			}
		}
		return sePudoPedir;
	}
	
	//puede ser Boolean
	public void devolverLibro(Prestamo libro) {
		prestamos.remove(libro);
	}
}
