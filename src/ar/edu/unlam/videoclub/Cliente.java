package ar.edu.unlam.videoclub;

public class Cliente {

	private final Integer MAYORIA_EDAD = 18;
	private String nroSocio;
	private String nombreYapellido;
	private Integer edad;
	
	public Cliente(String nroSocio, String nombreYapellido, Integer edad) {
		this.nroSocio = nroSocio;
		this.nombreYapellido = nombreYapellido;
		this.edad = edad;
	}

	public Boolean esMayorDeEdad() {
		Boolean esMayor=false;
		if(this.edad > this.MAYORIA_EDAD) {
			esMayor=true;
		}
		return esMayor;
	}
	
	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getNombreYapellido() {
		return nombreYapellido;
	}

	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
