package paquete; // Indicamos que esta clase también pertenece al paquete "paquete"

public class Principal {

	// Método main: punto de entrada de la aplicación
	public static void main(String[] args) {
		
		// Creamos una instancia del objeto Veterinario
		Veterinario veterinario = new Veterinario();
		
		// Llamamos al método menu() para iniciar el menú interactivo
		veterinario.menu();
	}
}
