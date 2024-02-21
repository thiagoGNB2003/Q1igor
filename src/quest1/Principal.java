package quest1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10 para apresentar sua tabuada:");
		int numUsuario = scan.nextInt();
		int contador = 0;

		while (contador < 11) {
			Calculadora ap = new Calculadora();
			System.out.print(""+ numUsuario);
			System.out.print(" x "+ contador);
			System.out.print(" = ");
			System.out.println(ap.calculadora(numUsuario, contador));
			contador++;

		}
	}

	private static void calculadora() {

	}
}
