package com.empresa.gestion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado = new Empleado();
        Gerente gerente = new Gerente();
        Entrenador entrenador = new Entrenador();

        empleado.trabajar();

        gerente.trabajar();
        gerente.gestionar();

        entrenador.trabajar();
        entrenador.entrenar();

	}

}
