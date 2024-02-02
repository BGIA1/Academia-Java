package com.single;
public class Principal {

    public static void main(String[] args) {
        // Se otiene la única instancia de MiSingleton
        Singleton instancia = Singleton.obtenerInstancia();

        // Llamada a métodos de la instancia
        instancia.metodoEjemplo();

        // Intento de crear una nueva instancia (no se permitirá)
        // Singleton nuevaInstancia = new Singleton(); // Esto generará un error

        // Obtención de la instancia desde otro lugar
        Singleton otraInstancia = Singleton.obtenerInstancia();
        
        // Validación del funcionamiento del Singleton
        System.out.println("¿Son las dos instancias iguales? " + (instancia == otraInstancia));
    }
}
