package maquinaDeCafeV1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> bebidas = new ArrayList<String>();
		bebidas.add("Espresso");
		bebidas.add("Espresso com leite");
		bebidas.add("Capuccino");
		
		int selecaoBebida = selecaoDeBebida();
		
		System.out.println("O seu " + bebidas.get(selecaoBebida) + " está servido!");

	}

	private static int selecaoDeBebida() {
		System.out.println("Selecione sua bebida:");
		System.out.println("Digite 1 para Espresso");
		System.out.println("Digite 2 para Espresso com leite");
		System.out.println("Digite 3 para Capuccino");
		
		Scanner in = new Scanner(System.in);
		int selecao = in.nextInt();
	
		aprimoramentoBebida(selecao);
		
		in.close();
		return selecao - 1;
	}

	private static void aprimoramentoBebida(int selecao) {
		Scanner in = new Scanner(System.in);
		
		switch (selecao) {
		case 1:
			System.out.println("Selecione a intensidade do seu café: 1, 2 ou 3");
			int i = in.nextInt();
			dosador(i,0,0,0);
			break;
		case 2:
			System.out.println("Selecione a proporção café/leite:");
			System.out.println("1 = mais café, 2 = média, 3 = mais leite");
			int p = in.nextInt();
			cafeComLeite(p);
			break;
		case 3:
			dosador(2,1,1,1);
			break;
		}
		
		in.close();
	}

	private static void dosadorCafe(int i) {
		System.out.println("Acionando mecanismo de dosagem de café!");
		
		int dosagem = 1;
		while ( dosagem <= i) {
			System.out.println("Café");
			dosagem++;
		}
	}
	
	private static void dosadorLeite(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de leite!");
		
		int dosagem = 1;
		while ( dosagem <= i) {
			System.out.println("Leite");
			dosagem++;
		}
	}
	
	private static void dosadorChocolate(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de chocolate!");
		
		int dosagem = 1;
		while ( dosagem <= i) {
			System.out.println("Chocolate");
			dosagem++;
		}
	}
	
	private static void dosadorLeiteFervido(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de leite fervido!");
		
		int dosagem = 1;
		while ( dosagem <= i) {
			System.out.println("Leite fervido");
			dosagem++;
		}
	}
	
	private static void dosador(int cafe, int leite, int chocolate, int leiteFervido) {
		dosadorCafe(cafe);
		dosadorLeite(leite);
		dosadorChocolate(chocolate);
		dosadorLeiteFervido(leiteFervido);
	}
	
	private static void cafeComLeite(int p) {
		switch (p) {
		case 1: dosador(3,1,0,0);
			break;
		case 2: dosador(2,2,0,0);
			break;
		case 3: dosador(1,3,0,0);
			break;
		}
	}	
}












