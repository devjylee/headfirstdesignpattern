package ch01;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly(); // 처음 ModelDuck 생성자에서 설정되었던 FlyNoWay 인스턴스의 Fly 출력
		model.setFlyBehavior(new FlyRocketPowered()); // setter 메소드를 통해 FlyBehavior에 FlyRockePowered의 Fly 세팅
		model.performFly(); // FlyRockePowered의 Fly 메소드 출력
	}

}
