package ch01.puzzle;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("검을 사용했다!");
	}

}
