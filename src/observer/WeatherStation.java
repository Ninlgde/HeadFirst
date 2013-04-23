package observer;

/**
 * @author Malik.Ma
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
