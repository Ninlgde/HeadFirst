package decorator.coffee;

import decorator.Beverage;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:42:27
 */
public class Espresso extends Beverage {

	public Espresso() {
		setDescription("Espresso");
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
