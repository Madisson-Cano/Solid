package com.empresa.gestion;

public class Entrenador implements Trabajable, Entrenable {
	public void trabajar() {
        System.out.println("El entrenador está trabajando.");
    }

    public void entrenar() {
        System.out.println("El entrenador está entrenando a los empleados.");
    }

}
