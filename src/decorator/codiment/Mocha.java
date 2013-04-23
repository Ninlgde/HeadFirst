package decorator.codiment;

import decorator.Beverage;
import decorator.CodimentDecrator;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:45:33
 */
public class Mocha extends CodimentDecrator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
