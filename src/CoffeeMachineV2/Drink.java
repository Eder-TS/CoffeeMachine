package CoffeeMachineV2;

import java.util.ArrayList;
import java.util.Scanner;

public class Drink {
	
	ArrayList<String> drinksOptions = new ArrayList<String>();
	
	public Drink() {
		drinksOptions.add("Espresso");
		drinksOptions.add("Espresso com leite");
		drinksOptions.add("Capuccino");
	}

	public String getSelection(int drinksSelection) {
		return drinksOptions.get(drinksSelection);
	}
	
	public int selectDrink() {
		System.out.println("Selecione sua bebida:");
		System.out.println("Digite 1 para Espresso");
		System.out.println("Digite 2 para Espresso com leite");
		System.out.println("Digite 3 para Capuccino");
		
		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();
	
		improveDrink(selection);
		
		in.close();
		return selection - 1;
	}
	
	private void improveDrink(int selection) {
		Scanner in = new Scanner(System.in);
		
		switch (selection) {
		case 1:
			System.out.println("Selecione a intensidade do seu café: 1, 2 ou 3");
			int i = in.nextInt();
			Dispenser.dose(i,0,0,0);
			break;
		case 2:
			System.out.println("Selecione a proporção café/leite:");
			System.out.println("1 = mais café, 2 = média, 3 = mais leite");
			int p = in.nextInt();
			coffeeWithMilk(p);
			break;
		case 3:
			Dispenser.dose(2,1,1,1);
			break;
		}
		
		in.close();
	}
	
	private void coffeeWithMilk(int p) {
		switch (p) {
		case 1: Dispenser.dose(3,1,0,0);
			break;
		case 2: Dispenser.dose(2,2,0,0);
			break;
		case 3: Dispenser.dose(1,3,0,0);
			break;
		}
	}
}
