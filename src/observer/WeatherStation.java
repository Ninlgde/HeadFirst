package observer;

/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:49:04
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
