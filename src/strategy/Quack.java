package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:01:57
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
