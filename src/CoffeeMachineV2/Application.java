package CoffeeMachineV2;

public class Application {

	public static void main(String[] args) {
		
		Drink drinks = new Drink();
		
		int drinksSelection = drinks.selectDrink();
		
		System.out.println("O seu " + drinks.getSelection(drinksSelection) + " está servido!");

	}	
}












