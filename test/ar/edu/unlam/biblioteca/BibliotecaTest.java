package ar.edu.unlam.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaAlquilarUnLibroCorrectamente() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("2", "Quimica avanzada", "desconocido", "desconocido", 3, TipoNivel.UNIVERSITARIO);
		Estudiante estudiante = new Estudiante("carolina gomez", "40123334", TipoNivel.UNIVERSITARIO);
		Prestamo prestamo = new Prestamo(estudiante, libro);
		Boolean valorEsperado = true;
		
		/*PriNaturales libro2 = new PriNaturales("2", "Quimica avanzada", "desconocido", "desconocido", 3, TipoNivel.UNIVERSITARIO);*/
		
		biblioteca.agregarLibro(libro); 
		biblioteca.alquilarLibro(prestamo);
		Boolean valorObtenido = biblioteca.alquilarLibro(prestamo);
		
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queSePuedaDevolverUnLibroYQueSeDescuenteDeLaListaDePrestamos() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("2", "Quimica avanzada", "desconocido", "desconocido", 3, TipoNivel.UNIVERSITARIO);
		Estudiante estudiante = new Estudiante("carolina gomez", "40123334", TipoNivel.UNIVERSITARIO);
		Prestamo prestamo = new Prestamo(estudiante, libro);
		Boolean valorEsperado = true;
		
		/*PriNaturales libro2 = new PriNaturales("2", "Quimica avanzada", "desconocido", "desconocido", 3, TipoNivel.UNIVERSITARIO);*/
		
		biblioteca.agregarLibro(libro); 
		biblioteca.alquilarLibro(prestamo);
		biblioteca.alquilarLibro(prestamo);
		
		biblioteca.devolverLibro(prestamo);
		biblioteca.devolverLibro(prestamo);
		
		Boolean valorObtenido = biblioteca.alquilarLibro(prestamo);
		Integer v1 = 1;
		Integer v2 = biblioteca.getCantidadLibrosPrestados();
		assertEquals(valorEsperado, valorObtenido);
		assertEquals(v1, v2);
	}
	@Test
	public void queSePuedaFotocopiarUnLibroFotocopiable() {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new PriSociales("2", "Sociales de Primaria", "desconocido", "desconocido", 3, TipoNivel.PRIMARIO);
		
		biblioteca.agregarLibro(libro);
		
		try {
		assertTrue(biblioteca.fotocopiarLibro("2"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*expected: para que el test termine con la excepción que arroja el THROWS
	 * Si no lo declaro, el catch ANULA mi EXCEPCIÓN*/
	@Test(expected = LibroNoEncontradoException.class)
	public void queNoSePuedaFotocopiarUnLibroInexsistente() throws LibroNoEncontradoException, LibroNoFotocopiableException {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new PriSociales("2", "Sociales 1", "desconocido", "desconocido", 3, TipoNivel.PRIMARIO);
		
		biblioteca.agregarLibro(libro);
		
		/*try {
			biblioteca.fotocopiarLibro("200");
		} catch (LibroNoFotocopiableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		biblioteca.fotocopiarLibro("200");
		
	}
	@Test(expected = LibroNoFotocopiableException.class)
	public void queNoSePuedaFotocopiarUnLibroQueNoSeaDeSociales() throws LibroNoFotocopiableException, LibroNoEncontradoException {
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new SecMatematica("2", " avanzada", "desconocido", "desconocido", 3, TipoNivel.PRIMARIO);
		
		biblioteca.agregarLibro(libro);
		
		biblioteca.fotocopiarLibro("2");
	}
}
