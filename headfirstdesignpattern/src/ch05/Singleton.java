package ch05;

public class Singleton {
	// Singleton 클래스의 유일한 인스턴스를 저장하기 위한 정적 변수
	private static Singleton uniqueInstance;
	
	// 기타 인스턴스 변수
	
	// 생성자를 private로 선언했기 때문에 Singleton에서만 클래스의 인스턴스를 만들 수 있다.
	private Singleton() {}
	
	// getInstance() 메소드에서는 클래스의 인스턴스를 만들어서 리턴.	
	public static Singleton getInstance() {
		// 인스턴스가 만들어지지 않았을 경우 생성(lazy instantiation)
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// 기타 메소드
}
