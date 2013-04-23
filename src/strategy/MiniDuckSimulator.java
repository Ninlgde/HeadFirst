package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:25:07
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		mallard.swim();
	}

}
