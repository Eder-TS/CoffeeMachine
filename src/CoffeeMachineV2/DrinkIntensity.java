package CoffeeMachineV2;

public class DrinkIntensity {
	private static int intensity = 0;
	
	public static void setMoreIntensity() {
		if (intensity >= 3) {
			return;
		}
		intensity++;		
	}
	
	public static void setLessIntensity() {
		if (intensity <= 1) {
			return;
		}
		intensity--;
		System.out.println(intensity);
	}
	
	public static int getIntensity() {
		return intensity;
	}

	public static void setIntensity() {
		intensity = 0;
	}
}
