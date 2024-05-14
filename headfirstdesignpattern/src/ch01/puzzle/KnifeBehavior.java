package ch01.puzzle;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("칼을 사용했다!");
	}

}
