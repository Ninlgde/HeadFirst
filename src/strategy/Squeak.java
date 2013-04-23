package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:03:18
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
