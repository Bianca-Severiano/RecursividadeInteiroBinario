package view;

import javax.swing.JOptionPane;

import controller.ControllerBinario;

public class Principal {

	public static void main(String[] args) {
		int valor = 0;

		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valor:"));
		} while (valor < 0 || valor >= 2000);

		ControllerBinario cb = new ControllerBinario();
		System.out.println(cb.ConversorBinario(valor));

	}

}
