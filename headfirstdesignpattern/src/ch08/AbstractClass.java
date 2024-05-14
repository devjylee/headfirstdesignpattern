package ch08;

// 추상클래스로 선언
// 실제로 구현해주는 서브클래스를 만들어야함
public abstract class AbstractClass {
	
	// 템플릿 메소드
	// 서브클래스에서 알고리즘의 각 단계를 마음대로 건드리는 것을 방지하기 위해 final로 선언.
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}

	// 서브클래스에서 구현해야 할 메소드
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	// 추상 클래스 내의 구상 메소드
	public void concreteOperation() {
		// concreteOperation() 코드
	}
	
	// 후크(hook)
	// 아무것도 하지 않는 구상 메소드
	public void hook() {}

}
