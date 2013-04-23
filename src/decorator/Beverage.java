package decorator;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午5:37:47
 */
public abstract class Beverage {

	private String description = "Unknown Beverage";

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
