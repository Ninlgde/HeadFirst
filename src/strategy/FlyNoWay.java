package strategy;
/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:00:54
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cannot fly!");
	}

}
