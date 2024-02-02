package com.poli;

public class Principal {

	public static void main(String[] args) {
		// Crear instancias de las clases derivadas
        Animal miPerro = new Perro("Firulais", 8);
        Animal miGato = new Gato("Michi", 5);
        Animal miPaloma = new Paloma("Liza", 3);

        // Llamar al método hacerSonido() de manera polimórfica

        miPerro.hacerSonido(); // Imprime "Guau guau"
        miGato.hacerSonido();  // Imprime "Miau"
        miPaloma.hacerSonido();  // Imprime "Sonido genérico de un animal"
    
        //En las clases que se sobre escribe el método hacerSonido() se tiene otro comportamiento al de la clase padre "Animal" (polimorfismo)
        
        // El polimorfismo permite tratar objetos derivados como objetos base
        // Sin embargo, solo se pueden llamar a métodos que están en el tipo base        
        // Para llamar a métodos específicos de la clase derivada, necesitaríamos hacer un casting.
        ((Perro) miPerro).perseguirCola(); // Se realiza casting para llamar a un método específico de Perro
        ((Gato) miGato).arañarMuebles();  // Se realiza casting para llamar a un método específico de Gato
        ((Paloma) miPaloma).alzarVuelo();  // Se realiza casting para llamar a un método específico de Paloma
        
        //Obtener los valores de de los objetos mediante los getters
        
        int edad1 = ((Perro)miPerro).getEdad();
        String nombre1 = ((Perro)miPerro).getNombre();
        System.out.println("La edad de: " + nombre1 + " es: " + edad1);
        
        //Asignar un nuevo valor al objeto usando los setters
        ((Perro)miPerro).setEdad(9);
        //Verificamos que se aplico el cambio
        
        edad1 = ((Perro)miPerro).getEdad();
        nombre1 = ((Perro)miPerro).getNombre();
        System.out.println("La edad de: " + nombre1 + " es: " + edad1);
        
    }

}


