package decorator.coffee;

import decorator.Beverage;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:43:59
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("HouseBlend");
	}

	@Override
	public double cost() {
		return 1.0;
	}

}
