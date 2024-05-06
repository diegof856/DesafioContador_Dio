package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entidade.Parametros;
import Excecao.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner scan = new Scanner(System.in);

		try {
			// optei por criar esse objeto para armazenar os dados
			Parametros parametros = inserirParametros(scan);
			// enviar o objeto para metodo contar
			contar(parametros);

		} catch (InputMismatchException e) {
			// lanca a mensagem de exececao se o usuario digitar uma letra
			System.out.println("Se aceita apenas numeros inteiros");

		} catch (ParametrosInvalidosException e) {
			// exececao de parametros invalidos
			System.out.println("O primeiro parâmetro não pode ser maior que o segundo parametro");
		}

		scan.close();
	}

	static Parametros inserirParametros(Scanner scan) throws InputMismatchException {
		// insercao dos dados se o usuario digitar uma letra lancara uma execeçao
		System.out.print("Digite o primeiro parametro: ");
		int primeiroParametro = scan.nextInt();
		System.out.print("Agora digite o segundo parametro: ");
		int segundoParametro = scan.nextInt();
		// cria o objeto e retorna com os parametros
		return new Parametros(primeiroParametro, segundoParametro);
	}

	static void contar(Parametros parametros) throws ParametrosInvalidosException {
		// validar parametros se o primeiro parametro for maior que o segundo lancara
		// uma exececao
		if (parametros.getPrimerioParametro() > parametros.getSegundoParametro()) {
			throw new ParametrosInvalidosException();
		} else {
			// calcula a diferença do segundo parametro para o primeiro e armazena em uma
			// variavel
			int contagem = parametros.getSegundoParametro() - parametros.getPrimerioParametro();
			// imprimir a diferença
			for (int indice = 0; indice < contagem; indice++) {
				System.out.print((indice + 1) + " ");
			}
		}

	}
}
