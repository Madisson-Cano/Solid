package com.empresa.gestion;

public class Gerente implements Trabajable, Gestionable {
	public void trabajar() {
        System.out.println("El gerente está trabajando.");
    }

    public void gestionar() {
        System.out.println("El gerente está gestionando a los empleados.");
    }

}
