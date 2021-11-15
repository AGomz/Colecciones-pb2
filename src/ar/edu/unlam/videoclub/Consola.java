package ar.edu.unlam.videoclub;

import java.util.ArrayList;
import java.util.List;

/*Una consola USA un Juego -> AGREGACION*/
public class Consola implements Alquilable{

	private String id;
	private TipoConsola tipo;
	private List<Juego> juegos;
	
	public Consola(String id, TipoConsola tipo) {
		this.id = id;
		this.tipo = tipo;
		this.juegos = new ArrayList<Juego>();
	}

	public void agregarJuego(Juego juego) {
		juegos.add(juego);
	}
	
	public Integer obtenerCantidadDeJuegos() {
		Integer cantidad=0;
		cantidad = juegos.size();
		return cantidad;
	}
	
	public Boolean esAlquilable() {
		Boolean esAlquilable = true;
		return esAlquilable;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoConsola tipo) {
		this.tipo = tipo;
	}
	
}
