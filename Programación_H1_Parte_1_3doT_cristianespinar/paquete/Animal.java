package paquete; // Indicamos que esta clase pertenece al paquete llamado "paquete"

public abstract class Animal {
	
	// Atributos protegidos para que puedan ser accedidos desde clases hijas
	protected String numero_chip; // Identificador único del animal
	protected String nombre;      // Nombre del animal
	protected int edad;           // Edad del animal
	protected String raza;        // Raza del animal
	protected boolean adoptado;   // Indica si el animal fue adoptado o no
	
	// Constructor que inicializa los atributos del animal
	public Animal(String numero_chip, String nombre, int edad, String raza, boolean adoptado) {
		this.numero_chip = numero_chip;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.adoptado = adoptado;
	}
	
	// Método getter que devuelve el número de chip del animal
	public String getNumeroChip() {
		return numero_chip;
	}

	// Método mostrar sin implementación, se espera que lo implementen las subclases
	public void mostrar() {
		// Este método será sobreescrito en las clases hijas para mostrar la info del animal
	}
}
