package ch08;

// Comparable 인터페이스 구현
public class Duck implements Comparable {
	
	String name;
	int weight;
	
	// Duck에 이름과 체중 부여
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	// Duck의 이름과 체중 출력
	public String toString() {
		return name+ ", 체중: "+weight;
	}

	@Override
	public int compareTo(Object object) {
		// 다른 Duck 객체를 인자로 받아서 비교
		Duck otherDuck = (Duck)object;
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else {
			return 1;
		}
	}

}
