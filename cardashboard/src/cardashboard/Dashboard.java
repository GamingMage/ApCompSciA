package cardashboard;

public class Dashboard {

	private int speedometer;
	private int odometer;
	private int trip;
	private boolean checkEngine;
	
	public Dashboard(int milesTraveled, int speed) {
		if(milesTraveled >= 0 && milesTraveled <= 99999) {
			odometer = milesTraveled;
		}else {
			odometer = 0;
			checkEngine = true;
		}
		if(speed >= 0 && speed <= 100) {
			speedometer = speed;
		}else {
			speedometer = 0;
			checkEngine = true;
			return;
		}
		checkEngine = false;
	}
	public Dashboard() {
		this (0, 0);
	}
	
	public String toString() {
		String zeros = "";
		for (int i = 10000; i < 10; i/=10) {
			if(odometer % i == odometer) {
				zeros += "0";
			}
		}
		return "Speedometer: " + speedometer + " MPH\nOdometer: " + zeros + odometer + "\nCheck Engine: " + checkEngine;
	}
	
	public void accelerate() {
		speedometer++;
		if(speedometer > 100) {
			speedometer = 0;
			checkEngine = true;
		}
	}
	public void drive(int numMinutes) {
		numMinutes = Math.abs(numMinutes);
		if(numMinutes > 720) {
			numMinutes = 720;
		}
		odometer += (int)((numMinutes/60.0)*speedometer);
		if(odometer > 99999) {
			odometer = 0;
			checkEngine = true;
		}
	}
	
	public int getSpeed() {
		return speedometer;
	}
	public int getOdometer() {
		return odometer;
	}
	public boolean getCheckEngine() {
		return checkEngine;
	}
	
}
