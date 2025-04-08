package paquete; // La clase pertenece al mismo paquete que la clase Animal

// Clase Perro que hereda de la clase abstracta Animal
public class Perro extends Animal {
	
	private String tamaño; // Atributo específico de la clase Perro (por ejemplo: pequeño, mediano, grande)
	
	// Constructor que recibe los atributos del animal y también el tamaño del perro
	public Perro(String numero_chip, String nombre, int edad, String raza, boolean adoptado, String tamaño) {
		super(numero_chip, nombre, edad, raza, adoptado); // Llamamos al constructor de la superclase (Animal)
		this.tamaño = tamaño; // Inicializamos el nuevo atributo propio de Perro
	}
	
	// Sobrescribimos el método mostrar() definido en la clase Animal
	@Override
	public void mostrar() {
		// Imprimimos en consola todos los datos del perro, incluyendo el tamaño
		System.out.println("Numero de chip: " + numero_chip);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Raza: " + raza);
		System.out.println("Adoptado: " + adoptado);
		System.out.println("Tamaño: " + tamaño);
	}
}
