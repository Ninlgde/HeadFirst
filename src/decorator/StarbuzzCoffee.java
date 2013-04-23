package decorator;

import decorator.codiment.Mocha;
import decorator.codiment.Whip;
import decorator.coffee.Espresso;
import decorator.coffee.HouseBlend;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:49:17
 */
public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage1 = new HouseBlend();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		System.out
				.println(beverage1.getDescription() + " $" + beverage1.cost());
	}

}
