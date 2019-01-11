package ProyectoFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Gestion_Clientes_Prueba {
	public static final int medida_vectorClientes = 1;

	public static void main(String[] args) {
		Gestion_Clientes_Prueba gc = new Gestion_Clientes_Prueba();
		gc.menu();
	}
	public void menu() {
		//Arrays para almacenar los datos de cada cliente
		String [] Clientes = new String [medida_vectorClientes];
		//Variable con la que seleccionaremos que funcion ejecutar 
		int op=0;

		//Boolean con el que controlaremos la salida /entrada del bucle
		boolean salir = false;
		//Iniciamos el bucle
		do {
			System.out.println("Bienvenido al gestor de Cliente que operacion deseas realizar ?ç"
					+ "\n 1 - Alta Cliente "
					+ "\n 2 - Visualizar Cliente"
					+ "\n 3 - Dar de Baja a un cliente "
					+ "\n 4 - Recuperar Datos Cliente "
					+ "\n 5 - Ordenar Clientes "
					+ "\n 6 - Recerca Client "
					+ "\n 7 - Salir"
					+ "\n ===================");
			op= leerValor();
			switch (op) {
			case 1:
				System.out.println("===================");
				Clientes = altaClient(Clientes);
				System.out.println("===================");
				break;
			case 2:
				System.out.println("===================");
				visualizarCliente(Clientes);
				System.out.println("===================");
				break;
			case 3:
				System.out.println("===================");
				bajaCliente(Clientes);
				System.out.println("===================");
				break;
			case 4:
				System.out.println("===================");
				RecuperarCliente(Clientes);
				System.out.println("===================");
				break;
			case 6:
				System.out.println("===================");
				busquedaCliente(Clientes);
				System.out.println("===================");
				break;
			case 7:
				System.out.println("===================");
				System.out.println("Cerrando Sistema ..... ");
				System.out.println("===================");
				break;
			}
		}while(op!=7);
		System.out.println("==========================");
		System.out.println("Sistema Cerrado");
		System.out.println("==========================");
		System.out.println("Vector" +Arrays.toString(Clientes));

	}

	/*Metodos para añadir,eliminar,recuperar y visualizar clientes */
	public String[] altaClient(String[] clients) {
		System.out.println("Bienvenido a la interfaz de Añadir Cliente ");
		System.out.println("==========================");
		String [] arrayNou = null;


		//Variables del Cliente( Datos del Cliente) 
		boolean borrado = false;
		int telefono,codigo;
		String nombre = "",apellido,NIF;
		int pos=0;
		int nueva_medida = 0;
		String confirmacion = "";
		boolean finalizado = false;

		while(!finalizado) {
			if(pos>=clients.length) {
				System.out.println("Has llegado al limite ,quieres expandir el array? ");
				confirmacion = leerString();
				if(confirmacion.equalsIgnoreCase("si")) {

					//PAS 1
					arrayNou = new String[clients.length + 1];
					for (int i = 0; i < clients.length; i++) {
						arrayNou[i] = clients[i];
					}
					clients = arrayNou;
					System.out.println("Vector" +Arrays.toString(clients));
				}else {
					finalizado = true;
				}
			}else {
				if(clients[pos]==null) {
					System.out.println("Codigo Cliente ");
					codigo = leerValor();

					System.out.println("Nombre Cliente ");
					nombre = leerString();

					System.out.println("Apellido Cliente ");
					apellido = leerString();

					System.out.println("DNI Cliente ");
					NIF = leerString();

					System.out.println("Telefono Cliente ");
					telefono = leerValor();

					//Metemos los datos dentro de la posicion del array 
					clients[pos] = "S"+";"+codigo+";"+nombre+";"+apellido+";"+NIF+";"+telefono;
					System.out.println("Vector Redimensionado " +Arrays.toString(clients));
					finalizado = true;
				}else {
					pos++;
				}
			}
		}
		System.out.println("===========================");
		System.out.println("Usuario " +nombre + " Añadido a la base de Datos ");
		return clients;
	}	
	public String [] visualizarCliente(String [] personas ) {
		System.out.println("Que usuario Quieres visualizar? ");
		String busqueda = leerString();
		boolean finalizado = false;
		int pos = 0;
		while(!finalizado) {
			if(pos == personas.length) {
				System.out.println("Array Completamente Recorrido,sin ningun resultado ");
				finalizado = true;
			}else {
				if(personas[pos].contains(busqueda)) {
					System.out.println("Usuario Encontrado");
					System.out.println("====================");
					System.out.println("Cliente --> " + personas[pos]);
					finalizado = true;
				}else {
					pos++;
				}
			}

		}
		return personas;
	}
	public String [] bajaCliente(String [] personas ) {
		/*N = No dado de Alta
		 *S = Si dado de Alta*/
		System.out.println("a Que Cliente quieres dar de baja ? ");
		String borrar = leerString();
		int pos =0;
		boolean finalizado = false;

		while(!finalizado) {
			if(pos == personas.length) {
				finalizado = true;
			}else {
				if (personas[pos].contains("S")) {
					personas[pos]=personas[pos].replaceFirst("S", "N");
					finalizado =true;
				}else {
					System.out.println("El Usuario ya esta dado de baja ");
				}
			}
		}

		return personas;
	}
	public String [] RecuperarCliente(String [] personas ) {
		/*N = No dado de Alta
		 *S = Si dado de Alta*/
		System.out.println("Que Cliente quieres Recuperar? ");
		String borrar = leerString();
		int pos =0;
		boolean finalizado = false;

		while(!finalizado) {
			if(pos == personas.length) {
				finalizado = true;
			}else {
				if (personas[pos].contains("N")) {
					personas[pos]=personas[pos].replaceFirst("N", "S");
					finalizado =true;
				}else {
					System.out.println("El Usuario ya esta dado de alta ");
				}
			}
		}
		return personas;
	}
	public boolean  busquedaCliente(String [] personas ) {
		System.out.println("Que clientes quieres buscar ? ");
		String recerca = leerString();
		boolean encontrado =false;
		boolean finalizado = false;
		int i =0;
		while(!encontrado) {
			if(i==personas.length) {
				encontrado = true;
			}else{
				i=0;
				if (personas[i].contains(recerca)) {
					encontrado = true;
					System.out.println("El Cliente " + recerca + " Existe ");
				}else {
					System.out.println("El Cliente " + recerca + " No Existe ");
				}
				i++;	
			}
		}
		return encontrado;
	}

	/*Metodos para Recoger Datos */
	public int leerValor() {
		//Clase Scanner para leer lo que ponemos en la consola
		Scanner scan = new Scanner(System.in);
		//Variable que vamos a retornar al metodo principal
		int numero =0;
		//Boolean para controlar cuando entra/sale del bucle
		boolean salir =false;

		//Bucle en el cual verificamos que el usuario ha metido un integer
		while(!salir) {
			//Saldremos del bucle cuando salir valga true
			if(scan.hasNextInt()) {
				numero = scan.nextInt();
				salir=true;
			}else {
				System.out.println("Error!");
				//Limpiamos el Scanner
				scan.nextLine();
			}
		}
		//Devolvemos el valor
		return numero;
	}
	public String leerString() {
		Scanner scan = new Scanner(System.in);
		String cadena = "";
		//Leemos el valor 
		cadena = scan.next();
		//Devolvemos el valor 
		return cadena;
	}

}
