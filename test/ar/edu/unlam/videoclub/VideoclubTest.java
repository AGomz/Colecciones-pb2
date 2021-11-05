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
		Pelicula pelicula = new Pelicula(id, titulo, anio, tipo);
		
		videoclub.agregarPelicula(pelicula);
		videoclub.agregarPelicula(pelicula);
		Integer valorObtenido = videoclub.obtenerCantidadDePeliculas();
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queSePuedaAgregarConsolasAlBlockbuster() {
		String id="2";
		TipoConsola tipo= TipoConsola.PLAY3;
		Blockbuster videoclub = new Blockbuster();
		Consola consola = new Consola(id, tipo);
		
		Boolean valorObtenido = videoclub.agregarConsola(consola);
		assertTrue(valorObtenido);
	}
	@Test
	public void queSePuedaAgregarUnAlquilerCorrectamente() {
		String idConsola = "23";
		String idPelicula = "10";
		String nroSocio = "444";
		Blockbuster videoclub = new Blockbuster();
		Alquiler alquiler = new Alquiler(idPelicula, idConsola, nroSocio);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = videoclub.agregarAlquiler(alquiler);
		assertEquals(valorEsperado, valorObtenido);
	}

}
