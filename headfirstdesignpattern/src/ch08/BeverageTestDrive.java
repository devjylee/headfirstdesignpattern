package ch08;

public class BeverageTestDrive {

	public static void main(String[] args) {
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("\n차 준비중...");
		teaHook.prepareRecipe();
		
		System.out.println("\n 커피 준비중...");
		coffeeHook.prepareRecipe();
	}

}
