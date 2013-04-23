package decorator.codiment;

import decorator.Beverage;
import decorator.CodimentDecrator;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:48:37
 */
public class Whip extends CodimentDecrator {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
