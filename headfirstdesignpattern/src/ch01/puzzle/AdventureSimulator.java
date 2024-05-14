package ch01.puzzle;

public class AdventureSimulator {

	public static void main(String[] args) {
		Queen q = new Queen();
		q.fight();
		q.setWeapon(new BowAndArrowBehavior());
		q.useWeapon();
		
		King k = new King();
		k.fight();
		k.setWeapon(new KnifeBehavior());
		k.useWeapon();
		
		Troll t = new Troll();
		t.fight();
		t.setWeapon(new AxeBehavior());
		t.useWeapon();
		
		Knight kn = new Knight();
		kn.fight();
		kn.setWeapon(new SwordBehavior());
		kn.useWeapon();
		
	}

}
