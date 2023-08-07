package CoffeeMachineV2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Espresso");
		drinks.add("Espresso com leite");
		drinks.add("Capuccino");
		
		
		int drinksSelection = Drink.selectDrink();
		
		System.out.println("O seu " + drinks.get(drinksSelection) + " está servido!");

	}	
}












