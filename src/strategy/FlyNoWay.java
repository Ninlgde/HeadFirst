package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:00:54
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cannot fly!");
	}

}
