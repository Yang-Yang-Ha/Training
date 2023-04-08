package observer_pattern_java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherData){
			WeatherData weatherData=(WeatherData)arg0;
			this.temperature=weatherData.getTemperature();
			this.humidity=weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+
				"F degree and"+humidity+"%humidity");
	}

}
