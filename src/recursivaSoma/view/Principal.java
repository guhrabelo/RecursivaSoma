package recursivaSoma.view;

import recursivaSoma.controller.RecursivaSoma;

public class Principal {
	public static void main(String[] args) {
		RecursivaSoma soma = new RecursivaSoma();
		
		int numero = 4;
		int ax = numero;
		
		numero = soma.recursiva(numero, ax);
		System.out.println(numero);
	}
}
