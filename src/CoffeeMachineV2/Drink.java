package CoffeeMachineV2;

public abstract class Drink{
	private static int drink = 0;
	//private static boolean chosedDrink = false;
	
	public static int getDrink() {
		return drink;
	}
	
	public static void setDrink() {
		drink = 0;
	}
	
	public static void improveDrink(int selection) {
		drink = selection;
		switch (drink) {
			case 1: {
				System.out.println("Selecione a intensidade do seu café: 1, 2 ou 3");
				Dispenser.setCoffee(DrinkIntensity.getIntensity());
				break;
			}
			case 2: {
				System.out.println("Selecione a proporção café/leite:");
				System.out.println("1 = mais café, 2 = média, 3 = mais leite");
				int p = DrinkIntensity.getIntensity();
				coffeeWithMilk(p);
				break;
			}
			case 3: {
				Dispenser.ingredients(2,1,1,1);
				break;
			}
		}
	}
	
	
	private static void coffeeWithMilk(int p) {
		switch (p) {
		case 1: Dispenser.ingredients(3,1,0,0);
			break;
		case 2: Dispenser.ingredients(2,2,0,0);
			break;
		case 3: Dispenser.ingredients(1,3,0,0);
			break;
		}
	}

}
