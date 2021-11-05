package ar.edu.unlam.pb2.colecciones;

public class Cliente implements Comparable<Cliente>{ //Orden Natural

	private String nombre;
	private Integer edad;
	private Integer dni;
	
	public Cliente(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	/*Source>generate equals y hashcode > nombre: atributo que quiero filtrar/comparar los 	objetos agregados. Si no, el criterio de comparación me lo da la clase Object*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false; //En este caso, no admito objetos que posean el mismo nombre
		return true;
	}

	@Override
	public int compareTo(Cliente otro) {
		//Filtro los objetos por el nombre: queSePresentenOrdenadosPorNombre
		return this.nombre.compareTo(otro.nombre);
		//Filtro por edad: queSePresentenOrdenadosPorEdad
		//return this.edad.compareTo(otro.edad);
	}
	
	
}
