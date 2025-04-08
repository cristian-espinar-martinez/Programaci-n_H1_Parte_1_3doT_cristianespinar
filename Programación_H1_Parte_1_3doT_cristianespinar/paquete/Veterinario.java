package paquete;

import java.util.ArrayList;
import java.util.Scanner;

// Clase Veterinario que contiene la lógica principal del sistema
public class Veterinario {
	
	// Creamos una lista de animales para almacenar perros y gatos
	ArrayList<Animal> listaAnimales = new ArrayList<>();
	
	// Objeto Scanner para leer la entrada del usuario
	Scanner scanner = new Scanner(System.in);
	
	// Método para añadir animales a la lista
	public void AñadirAnimales() {
		
		// Se agregan dos animales por defecto para tener datos de prueba
		listaAnimales.add(new Perro("1234", "Tovias", 5, "Dalmata", true, "grande"));
		listaAnimales.add(new Gato("2345", "Buddy", 2, "Golden Retriever", true, true));
		
		System.out.println("Introduce el numero para añadir el nuevo animal 1-Perro o 2-Gato: ");
		int tipo = scanner.nextInt(); // Se elige el tipo de animal (Perro o Gato)
		scanner.nextLine(); // Limpiamos el buffer
		
		// Pedimos los datos comunes a todos los animales
		System.out.println("Introduce el numero del chip: ");
		String numero_chip = scanner.nextLine();
		
		// Verificamos si ya existe un animal con ese chip
		if (existeChip(numero_chip)) {
			System.out.println("Ya existe un animal con ese número de chip.");
			return; // Salimos del método si ya existe
		}
		
		System.out.println("Introduce el nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduce la edad: ");
		int edad = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Introduce la raza: ");
		String raza = scanner.nextLine();
		
		System.out.println("Introduce si es adoptado o no (true/false): ");
		boolean adoptado = scanner.nextBoolean();
		scanner.nextLine();
		
		// Si el usuario eligió Perro, pedimos el tamaño
		if (tipo == 1) {
			System.out.println("\nIntroduce el tamaño del perro: PEQUEÑO/MEDIANO/GRANDE: ");
			String tamaño = scanner.nextLine();
			// Añadimos el nuevo perro a la lista
			listaAnimales.add(new Perro(numero_chip, nombre, edad, raza, adoptado, tamaño));
		
		// Si el usuario eligió Gato, pedimos el test de leucemia
		} else if (tipo == 2) {
			System.out.println("\nIntroduce el resultado del test de leucemia (true/false): ");
			boolean test_leucemia = scanner.nextBoolean();
			scanner.nextLine();
			// Añadimos el nuevo gato a la lista
			listaAnimales.add(new Gato(numero_chip, nombre, edad, raza, adoptado, test_leucemia));
		}
	}
	
	// Método para buscar un animal por su número de chip
	public void buscarNuevoChip() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIntroduce el número del chip: ");
		String numero_chip = scanner.nextLine();
		
		boolean buscar = false; // Variable para saber si lo encontramos o no
		
		// Recorremos la lista y mostramos el animal si lo encontramos
		for (Animal animales : listaAnimales) {
			if (animales.getNumeroChip().equals(numero_chip)) {
				animales.mostrar(); // Mostramos los datos
				buscar = true;
			}
		}
		
		if (!buscar) {
			System.out.println("\nNo se ha encontrado ningún animal.");
		}
	}
	
	// Método privado para verificar si ya existe un chip en la lista
	private boolean existeChip(String chip) {
		for (Animal animal : listaAnimales) {
			if (animal.getNumeroChip().equals(chip)) {
				return true;
			}
		}
		return false;
	}
	
	// Menú principal del programa veterinario
	public void menu() {
		int opcion;
		
		do {
			System.out.println("MENÚ VETERINARIO");
			System.out.println("1. Añadir animal");
			System.out.println("2. Buscar número de chip");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			switch (opcion) {
				case 1:
					AñadirAnimales(); // Llamamos al método para añadir un nuevo animal
					break;
				case 2:
					buscarNuevoChip(); // Buscamos un animal por chip
					break;
				case 3:
					System.out.println("Adiós");
					break;
				default:
					System.out.println("Opción no válida");
			}
		} while (opcion != 3); // El menú se repite hasta que el usuario elija salir
	}
}

