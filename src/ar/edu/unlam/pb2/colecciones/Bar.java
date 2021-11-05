package ar.edu.unlam.pb2.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Bar {

	private final Integer MAYORIA_EDAD=18;
	/*Lista Inicial, evoluciona a la siguiente para poder filtrar/ordenar datos
	private List<Cliente> clientes = new ArrayList<Cliente> ();
	private Set<Cliente> clientes = new HashSet<Cliente>(); NO admite duplicados pero el orden es cáotico*/
	
	//Me garantiza el orden de iteración
	private Set<Cliente> clientes = new TreeSet<Cliente>(); //Filtró los datos en Cliente
	
	//Set no admite duplicados y para HashSet y LinkedHashSet y usa -> equals + hashCode
	//Set necesita -> Orden -> si quiero usar TreeSet implemento la Interface Comparable;
	//negativo ~ 0 ~ positivo -> menor, igual o mayor. Es lo que hace el compareTo con los objetos que compara
	
	public void ingresarCliente(Cliente cliente) {
		//Devuelve un true o false si lo pudo agregar
		this.clientes.add(cliente);
	}

	public Integer obtenerCantidadDeClientes() {
		//Devuelve la cantidad de objetos en esa lista
		return clientes.size();
	}

	public Integer obtenerCantidadMayores() {
		Integer mayores=0;
		// for each
		for(Cliente cliente: this.clientes) {
			if(cliente.getEdad()>=this.MAYORIA_EDAD) {
				mayores++;
			}
		}
		return mayores;
	}

	/*Utilizamos TreeSet para poder utilizar el .first y .last en el Test
	 * Agrego clientes a mi bar:*/
	public TreeSet<Cliente> presentarClientes() {
		return (TreeSet<Cliente>)this.clientes; //Lo casteo
	}

	/*public TreeSet<Cliente> ordenarClientesPorEdad() {
		//1.Para que pueda agregarle un nuevo criterio de filtrado al anterior.Creo una nueva colección (porEdad)
		TreeSet <Cliente> porEdad = new TreeSet<Cliente>(new PorEdadComparator());
		//2.Agrego la colección que quiero ordenar
		porEdad.addAll(clientes);
		//3.Devuelvo esa misma colección
		return porEdad;
	}

	public TreeSet<Cliente> ordenarClientesPorDNI() {
		TreeSet <Cliente> porDni = new TreeSet<Cliente>(new PorDniComparator());
		porDni.addAll(clientes);
		return porDni;
	}*/
	
	/*Creo un método genérico que englobe a los anteriores y le paso como parámetro la clase Comparator en la que definí el criterio de ordenamiento*/
	public TreeSet<Cliente> ordenarClientesPor(Comparator criterio) {
		TreeSet <Cliente> ordenados = new TreeSet<Cliente>(criterio);
		ordenados.addAll(clientes);
		return ordenados;
	}

	
}
