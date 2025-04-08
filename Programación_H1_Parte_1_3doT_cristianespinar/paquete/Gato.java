package paquete; // Indicamos que esta clase pertenece al mismo paquete que las otras

// La clase Gato hereda de la clase abstracta Animal
public class Gato extends Animal {

	boolean test_leucemia; // Atributo específico del gato que indica si tiene leucemia (true o false)
	
	// Constructor que recibe todos los atributos del gato
	public Gato(String numero_chip, String nombre, int edad, String raza, boolean adoptado, boolean test_leucemia) {
		// Llamamos al constructor de la clase Animal para inicializar los atributos comunes
		super(numero_chip, nombre, edad, raza, adoptado);
		this.test_leucemia = test_leucemia; // Inicializamos el atributo específico de la clase Gato
	}
	
	// Sobrescribimos el método mostrar() para imprimir los datos del gato
	@Override
	public void mostrar() {
		// Mostramos todos los atributos del gato, incluyendo el resultado del test de leucemia
		System.out.println("Numero de chip: " + numero_chip);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Raza: " + raza);
		System.out.println("Adoptado: " + adoptado);
		System.out.println("Test leucemia: " + test_leucemia);
	}
}

