package ar.edu.unlam.pb2.colecciones;

import java.util.Comparator;

public class PorEdadComparator implements Comparator<Cliente> {

	/*Comparo 2 argumentos: 
	 * Retorna 0 si son IGUALES y no agrega los demás elem.
	 * Si el 2do es más chico devuelve un NEGATIVO
	 *  "  "  "  "   "  grande   "      " POSITIVO*/
	//Defino el NUEVO criterio de ORDENAMIENTO
	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getEdad().compareTo(o2.getEdad()); 
	}

}
