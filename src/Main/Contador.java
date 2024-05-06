package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entidade.Parametros;
import Excecao.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner scan = new Scanner(System.in);

		try {
			Parametros parametros = inserirParametros(scan);
			contar(parametros);

		} catch (InputMismatchException e) {
			System.out.println("Se aceita apenas numeros inteiros");

		} catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro parâmetro não pode ser maior que o segundo parametro");
		}

		scan.close();
	}

	static Parametros inserirParametros(Scanner scan) throws InputMismatchException {

		System.out.print("Digite o primeiro parametro: ");
		int primeiroParametro = scan.nextInt();
		System.out.print("Agora digite o segundo parametro: ");
		int segundoParametro = scan.nextInt();
		return new Parametros(primeiroParametro, segundoParametro);
	}

	static void contar(Parametros parametros) throws ParametrosInvalidosException {
		// validar parametros
		if (parametros.getPrimerioParametro() > parametros.getSegundoParametro()) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = parametros.getSegundoParametro() - parametros.getPrimerioParametro();

			for (int indice = 0; indice < contagem; indice++) {
				System.out.print((indice + 1) + " ");
			}
		}

	}
}
