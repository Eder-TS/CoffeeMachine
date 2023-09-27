package CoffeeMachineV2;

public abstract class Dispenser {
	private static int coffee = 0;
	private static int milk = 0;
	private static int chocolate = 0;
	private static int boiledMilk = 0;
	
	public static void ingredients(int coffee, int milk, int chocolate, int boiledMilk) {
		
		setCoffee(coffee);
		setMilk(milk);
		setChocolate(chocolate);
		setBoiledMilk(boiledMilk);
	}
	
	public static void makeADrink() {
		if (Drink.getChosedDrink()) {
			dose(coffee, milk, chocolate, boiledMilk);
		}
	}

	private static void dose(int coffee,int milk,int chocolate,int boiledMilk) {
		doseCoffee(coffee);
		doseMilk(milk);
		doseChocolate(chocolate);
		doseBoiledMilk(boiledMilk);
	}
	
	private static void doseCoffee(int i) {
		System.out.println("Acionando mecanismo de dosagem de café!");
		
		int dosage = 1;
		while ( dosage <= i) {
			System.out.println("Café");
			dosage++;
		}
	}
	
	private static void doseMilk(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de leite!");
		
		int dosage = 1;
		while ( dosage <= i) {
			System.out.println("Leite");
			dosage++;
		}
	}
	
	private static void doseChocolate(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de chocolate!");
		
		int dosage = 1;
		while ( dosage <= i) {
			System.out.println("Chocolate");
			dosage++;
		}
	}
	
	private static void doseBoiledMilk(int i) {
		if (i == 0) {
			return;
		}
		System.out.println("Acionando mecanismo de dosagem de leite fervido!");
		
		int dosage = 1;
		while ( dosage <= i) {
			System.out.println("Leite fervido");
			dosage++;
		}
	}

	private static void setCoffee(int coffee) {
		Dispenser.coffee = coffee;
	}

	public static void setMilk(int milk) {
		Dispenser.milk = milk;
	}

	public static void setChocolate(int chocolate) {
		Dispenser.chocolate = chocolate;
	}

	public static void setBoiledMilk(int boiledMilk) {
		Dispenser.boiledMilk = boiledMilk;
	}
	
	
}
