package com.poli;

public class Paloma extends Animal {

	private int edad;
	private String nombre;
	
    public Paloma(String nombre, int edad) {
    	this.nombre = nombre;
    	this.edad = edad;
	}

	@Override
    public void hacerSonido() {
        System.out.println("Sonidos de paloma");
    }
	
    public void alzarVuelo() {
        System.out.println("Volando");
    }
    
    public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    

}
