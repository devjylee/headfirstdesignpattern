package ch01.puzzle;

public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void useWeapon() {
		weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
}
