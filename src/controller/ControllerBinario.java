package controller;

public class ControllerBinario {

	public ControllerBinario() {
		super();
	}

	public String ConversorBinario(int valor) {
		String valorC = "";
		if (valor / 2 == 0) { /* Quando valor/0 resultar em 0 significa que procedimento de divisões consecutivas 
		chegou ao fim e deve-se retornar 1 para iniciar a concatenação dos valores de trás para frente */
			return "1";
		} else {
			int resto = valor % 2; // Realiza cálculo do resto da divisão para verificar se próximo valor concatenado será 0 ou 1
			valorC = valorC + ConversorBinario(valor / 2); // 

			if (resto >= 1) { // Se resto da divisão for = ou maior que 1, deve-se concatenar o 1
				return valorC + "1";
			} else {
				return valorC + "0"; // Caso não concatenar 0
			}
		}

	}

}

/* VALOR = 25
 * f(25) = f(12) + resto = 1 --> "11001"
 * f(12) = f(6) + resto = 0  --> "1100"
 * f(6) = f(3) + resto = 0--> "110" 
 * f(3) = f(1) + resto = 1  --> "11"
 * f(1) = 1
 * */
 