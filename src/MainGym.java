import Entity.Cliente;
import Service.ClienteService;

import java.util.Scanner;

public class MainGym {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		ClienteService clienteService = new ClienteService();

		clienteService.registrarCliente();
		clienteService.obtenerClientes();
		System.out.println("clienteService = " + clienteService.buscarCliente(1));




	}
}
