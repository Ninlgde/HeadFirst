package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午3:59:56
 */
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
