package strategy;
/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:02:32
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}

}
