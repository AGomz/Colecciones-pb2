package ar.edu.unlam.biblioteca;

public class Estudiante {

	private String nombreYapellido;
	private String documento;
	private TipoNivel tipo;
	
	public Estudiante(String nombreYapellido, String documento, TipoNivel tipo) {
		this.nombreYapellido = nombreYapellido;
		this.documento = documento;
		this.tipo = tipo;
	}
	
	/*public boolean esAptoParaPrestamo(TipoNivel tipo) {
		Boolean esApto=false;
		
		switch(tipo) {
		case UNIVERSITARIO:
			
		}
		return esApto;
	}*/
	
	public String getNombreYapellido() {
		return nombreYapellido;
	}

	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public TipoNivel getTipo() {
		return tipo;
	}

	public void setTipo(TipoNivel tipo) {
		this.tipo = tipo;
	}	
}
