package strategy;

/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:20:53
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
