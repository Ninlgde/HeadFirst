package strategy;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:20:53
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
