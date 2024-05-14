package ch05;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance;
	
	private boolean empty;
	private boolean boiled;
	
	// 보일러가 비어있을 때만 돌아감
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		// 인스턴스가 만들어지지 않았을 경우 생성(lazy instantiation)
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	// 보일러가 비어있을 때만 재료를 집어 넣는다.
	public void fill() {
		if(isEmpty()) {
			// 재료를 집어 넣고 empty와 boiled 플래그를 false로 설정
			empty = false;
			boiled = false;
		}
	}
	
	// 보일러가 가득 차있고 다 끓여진 상태에서 다음 단계로 넘어간다.
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			// 보일러를 비우고 empty 플래그를 false로 설정한다.
			empty = true;
		}
	}
	
	// 보일러가 가득 차있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓인다.
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// 재료가 다 끓고 나면 boiled 프래그를 true로 설정한다
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return empty;
	}
	
}
