package strategy;
/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:25:07
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
