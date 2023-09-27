package CoffeeMachineV2;

public class Drink{
	private static int intensity = 0;
	private static boolean chosedDrink = false;
	
	public Drink(String drink) {
		switch (drink) {
		case "Espresso": {
			chosedDrink = true;
			improveDrink(1);
			break;
		}
		case "Espresso com leite": {
			chosedDrink = true;
			improveDrink(2);
			break;
		}
		case "Capuccino": {
			chosedDrink = true;
			improveDrink(3);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + drink);
		}
	}
	
	public static boolean getChosedDrink() {
		return chosedDrink;
	}
	
	public static void setMoreIntensity() {
		intensity++;		
	}
	
	public static void setLessIntensity() {
		intensity--;		
	}
	
	public static int getIntensity() {
		return intensity;
	}
	
	private void improveDrink(int selection) {
		getintensity();
		switch (selection) {
			case 1: {
				System.out.println("Selecione a intensidade do seu café: 1, 2 ou 3");
				
				getIntensity();
				if (i == 0) {
					System.out.println("error");
					break;
				}
				Dispenser.ingredients(i,0,0,0);
				break;
			}
			case 2: {
				System.out.println("Selecione a proporção café/leite:");
				System.out.println("1 = mais café, 2 = média, 3 = mais leite");
				int p = getIntensity();
				coffeeWithMilk(p);
				break;
			}
			case 3: {
				Dispenser.ingredients(2,1,1,1);
				break;
			}
		}
	}
	
	private void coffeeWithMilk(int p) {
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
