package CoffeeMachineV2;

public abstract class Dispenser {
	
	public static void dose(int coffee, int milk, int chocolate, int boiledMilk) {
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
	
}
