package strategy;
/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:02:32
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}

}
