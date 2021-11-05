package ar.edu.unlam.pb2.colecciones;

import java.util.Comparator;

public class PorDniComparator implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getDni().compareTo(o2.getDni());
	}

}
