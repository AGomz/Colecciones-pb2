package ar.edu.unlam.videoclub;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VideoclubTest {
/*Entidad BlockBuster
-	Peliculas (List<Pelicula>)
-	Consolas (List<Consolas>)
-	Alquileres (List<Alquiler>)

Entidad Pelicula
-	id (String)
-	Título (String)
-	Año (String)
-	Tipo (Enum: Terror, Acción, Comedia, Condicionadas, Romanticas, Suspenso)

Entidad Consolas de Videojuegos
-	id (String)
-	Tipo de consola (Enum Nintendo 64, Play 3, Sega Genesis)
-	Juegos (List<Juegos>)

Entidad Juego
-	Titulo (String)
-	Año (String)

Entidad Alquiler
-	id de la película (String)
-	id de la consola (String)
-	Nro de Socio del cliente (String)

Entidad Cliente
-	Nro de socio
-	Nombre y apellido
-	Edad
 * */
	@Test
	public void queSePuedanAgregarPeliculasAlBlockbuster() {
		String id="1";
		String titulo="Parasite";
		String anio="2020";
		TipoPelicula tipo = TipoPelicula.SUSPENSO;
		Integer valorEsperado=2;
		Blockbuster videoclub = new Blockbuster();
		Pelicula pelicula = new TipoAccion(id, titulo, anio, tipo);
		
		videoclub.agregarPelicula(pelicula);
		videoclub.agregarPelicula(pelicula);
		Integer valorObtenido = videoclub.obtenerCantidadDePeliculas();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaAlquilarUnaPelicula() throws PeliculaNoEncontradaException, PeliculaNoAlquilableException {
		String id="1";
		String titulo="Parasite";
		String anio="2020";
		TipoPelicula tipo = TipoPelicula.SUSPENSO;
		Blockbuster videoclub = new Blockbuster();
		Pelicula pelicula = new TipoAccion(id, titulo, anio, tipo);
		Cliente cliente = new Cliente("a22", "carolina gomez", 20);
		
		videoclub.agregarPelicula(pelicula);
		
		videoclub.alquilarPelicula(cliente, pelicula);	
	}
	@Test(expected=PeliculaNoAlquilableException.class)
	public void  queNoSePuedaAlquilarUnaPeliculaQueNoExista() throws PeliculaNoEncontradaException, PeliculaNoAlquilableException {
		String id="1";
		String titulo="Parasite";
		String anio="2020";
		TipoPelicula tipo = TipoPelicula.ROMANCE;
		Blockbuster videoclub = new Blockbuster();
		Pelicula pelicula = new TipoRomance(id, titulo, anio, tipo);
		Cliente cliente = new Cliente("a22", "carolina gomez", 20);
		
		videoclub.agregarPelicula(pelicula);
		
		videoclub.alquilarPelicula(cliente, pelicula);	
	}

}
