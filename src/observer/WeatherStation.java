package observer;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:49:04
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentCoditionsDisplay currentDisplay = new CurrentCoditionsDisplay(
				weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
