package ar.edu.unlam.pb2.colecciones;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class BarTest {

	@Test
	public void queEstenTodosLosClientesPresentes() {
		Cliente cliente1 = new Cliente ("Benjam�n", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 123);
		Cliente cliente3 = new Cliente ("Maximiliano", 15, 122);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		Integer valorEsperado = 3;
		assertEquals(valorEsperado, bar.obtenerCantidadDeClientes());
	}
	@Test
	public void queSeCuentenLosMAyoresDeEdadPresentes() {
		Cliente cliente1 = new Cliente ("Benjam�n", 18, 113);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 112);
		Cliente cliente3 = new Cliente ("Maximiliano", 15, 122);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		Integer valorEsperado = 2;
		//Llamo a m�todo que cuente a los mayores de edad
		assertEquals(valorEsperado, bar.obtenerCantidadMayores());
	}
	/*Defino el filtro mediante el equals() en la clase Cliente */
	@Test
	public void queNoSeAdmitanClientesConElMismoNombre() {
		Cliente cliente1 = new Cliente ("Benjam�n", 18, 122);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 123);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 123);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		Integer valorEsperado = 2; //Excluyo a un Benjam�n
		assertEquals(valorEsperado, bar.obtenerCantidadDeClientes());
	}
	/*Defino el filtro mediante el compareTo() en la clase Cliente */
	@Test
	public void queSePresentenOrdenadosPorNombre() {
		Cliente cliente1 = new Cliente ("Maximiliano", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 123);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 123);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		Integer valorEsperado = 3;
		assertEquals(valorEsperado, bar.obtenerCantidadDeClientes());
		assertEquals(cliente2, bar.presentarClientes().first());
		assertEquals(cliente1, bar.presentarClientes().last());
	}
	/*Ordenamiento GEN�RICO al pasar como par�metro el Comparator*/
	@Test
	public void queSePresentenOrdenadosPorEdad() {
		Cliente cliente1 = new Cliente ("Maximiliano", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 123);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 123);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		
		TreeSet <Cliente> porEdad = bar.ordenarClientesPor(new PorEdadComparator());
		assertEquals(cliente3.getNombre(), porEdad.first().getNombre());
		assertEquals(cliente2.getNombre(), porEdad.last().getNombre());
	}
	@Test
	public void queSePresentenOrdenadosPorDNI() {
		Cliente cliente1 = new Cliente ("Maximiliano", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 312);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 888);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		
		TreeSet <Cliente> ordenados = bar.ordenarClientesPor(new PorDniComparator());
		
		assertEquals(cliente1.getNombre(), ordenados.first().getNombre());
		assertEquals(cliente3.getNombre(), ordenados.last().getNombre());
	}
}
	/****Forma NO gen�rica*****
	 * @Test
	public void queSePresentenOrdenadosPorEdad() {
		Cliente cliente1 = new Cliente ("Maximiliano", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 123);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 123);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		
		TreeSet <Cliente> porEdad = bar.ordenarClientesPorEdad();
		
		assertEquals(cliente3.getNombre(), porEdad.first().getNombre());
		assertEquals(cliente2.getNombre(), porEdad.last().getNombre());
	}
	@Test
	public void queSePresentenOrdenadosPorDNI() {
		Cliente cliente1 = new Cliente ("Maximiliano", 18, 123);
		Cliente cliente2 = new Cliente ("Ayel�n", 28, 312);
		Cliente cliente3 = new Cliente ("Benjam�n", 15, 888);
		Bar bar = new Bar();
		bar.ingresarCliente(cliente1);
		bar.ingresarCliente(cliente2);
		bar.ingresarCliente(cliente3);
		
		TreeSet <Cliente> porDNI = bar.ordenarClientesPorDNI();
		
		assertEquals(cliente1.getNombre(), porDNI.first().getNombre());
		assertEquals(cliente3.getNombre(), porDNI.last().getNombre());
	}*/
	
