package ch08;

public abstract class CaffeineBeverage {
	
	// 서브클래스에서 이 메소드를 오버라이드해서 아무렇게나 음료를 만들지 못하도록 final로 선언
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
	
}
