package com.single;
public class Singleton {

    // Generación de la única instancia de la clase
    private static Singleton instancia;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton() {
        // Inicialización de la instancia, si es necesario
    }

    // Método público para obtener la instancia única de la clase
    public static Singleton obtenerInstancia() {
        // Verifica si la instancia ya ha sido creada
        if (instancia == null) {
            // Si no existe, crea la instancia
            instancia = new Singleton();
        }
        // Devuelve la instancia única
        return instancia;
    }

    // Otros métodos y atributos de la clase pueden ir aquí

    public void metodoEjemplo() {
        System.out.println("Metodo ejecutado");
    }
}
