package Service;

import Entity.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

	// Se crea un objeto Scanner para leer la entrada del usuario
	Scanner leer = new Scanner(System.in).useDelimiter("\n");;

	// ArrayList para almacenar los objetos Cliente
	ArrayList<Cliente> clientes = new ArrayList<>();

	// Atributos de la clase ClienteService
	private static int nextId = 1; // Variable estática para el siguiente ID de cliente
	private int id_usuario; // ID del cliente actual


	/**
	 * @incrementoId es el metodo que nos permite incrementar el ID del cliente en 1
	 */
	public void incrementoId() {
		id_usuario = nextId; // Asigna el valor actual de nextId a id_usuario
		nextId++; // Incrementa nextId para el próximo cliente
	}


	/**
	 * @registrarCliente es el metodo que nos permite registrar un cliente
	 */
	public void registrarCliente() {
		Cliente cliente = new Cliente(); // Se crea un nuevo objeto Cliente

		incrementoId(); // Se asigna el ID al cliente

		// Se solicita al usuario que ingrese información del cliente
		System.out.println("Ingrese el nombre del cliente");
		cliente.setNombre(leer.next());

		System.out.println("Ingrese la edad del cliente");
		cliente.setEdad(leer.nextInt());

		System.out.println("Ingrese la altura del cliente");
		cliente.setAltura(leer.nextDouble());

		System.out.println("Ingrese el peso del cliente");
		cliente.setPeso(leer.nextDouble());

		System.out.println("Ingrese el objetivo del cliente");
		cliente.setObjetivo(leer.next());

		clientes.add(cliente); // Se agrega el cliente al ArrayList
	}


	/**
	 * @obtenerClientes el el metodo que nos permite obtener los clientes
	 * @for recorremos el ArrayList y mostramos la información de cada cliente
	 * @get(i) devuelve el elemento en la posición i del ArrayList
	 */
	public void obtenerClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).toString());
		}
	}


	/**
	 * @buscarCliente es el metodo que nos permite buscar un cliente por su nombre y actualizarlo en el ArrayList
	 * @for recorremos el ArrayList y comparamos el nombre ingresado por el usuario con el nombre de cada cliente
	 * @equalsIgnoreCase compara dos cadenas de texto sin importar si son mayúsculas o minúsculas
	 * @if si el nombre ingresado por el usuario es igual al nombre de un cliente, se actualiza la información del cliente en el ArrayList.
	 * @actualizarCliente es el metodo que nos permite actualizar la información del cliente en el ArrayList
	 */
	public void buscarCliente() {

		System.out.println("Ingrese el nombre del cliente");
		String nombreIngresado = leer.next();
		boolean bandera = false;

		for (int i = 0; i < clientes.size(); i++) {

			if (nombreIngresado.equalsIgnoreCase(clientes.get(i).getNombre())) {
				bandera = true;

				//Aqui solicitamos al usuario que ingrese nueva información para actualizar el cliente en el ArrayList
				System.out.println("Ingrese el nuevo nombre del cliente");
				String nombre = leer.next();

				System.out.println("Ingrese la nueva edad del cliente");
				int edad = leer.nextInt();

				System.out.println("Ingrese la nueva altura del cliente");
				double altura = leer.nextDouble();

				System.out.println("Ingrese el nuevo peso del cliente");
				double peso = leer.nextDouble();

				System.out.println("Ingrese el nuevo objetivo del cliente");
				String objetivo = leer.next();

				//Aqui llamamos al método actualizarCliente() para actualizar el cliente en el ArrayList
				actualizarCliente(clientes.get(i).getId(), nombre, edad, altura, peso, objetivo);
			}
		}

		if (bandera == false) {
			System.out.println("No se encontró el cliente con ese nombre en la lista");
		}
	}


	/**
	 * @actualizarCliente es el metodo que nos permite actualizar la información de un cliente en el ArrayList
	 * @Cliente cliente es el objeto Cliente que se va a actualizar en el ArrayList clientes
	 * @for recorremos el ArrayList y comparamos el ID ingresado por el usuario con el ID de cada cliente
	 * @if si el ID ingresado por el usuario es igual al ID de un cliente, se actualiza la información del cliente en el ArrayList.
	 * @obtenerClientes es el metodo que nos permite mostrar la lista actualizada del cliente
	 */
	//Aqui teneos un Método para actualizar la información de un cliente
	public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
		Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getId() == id) {
				clientes.set(i, cliente); //Aqui se actualiza el cliente en el ArrayList
			}
			obtenerClientes(); //Aqui se muestra la lista actualizada del cliente
		}
	}


	public void eliminarCliente(int id){

		boolean bandera = false;

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getId() == id) {
				clientes.remove(i); //Aqui se elimina el cliente en el ArrayList
				bandera = true;
			}
		}
	}


}
