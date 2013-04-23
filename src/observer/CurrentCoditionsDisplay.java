package observer;

/**
 * @author Malik.Ma
 */
public class CurrentCoditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentCoditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current coditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
