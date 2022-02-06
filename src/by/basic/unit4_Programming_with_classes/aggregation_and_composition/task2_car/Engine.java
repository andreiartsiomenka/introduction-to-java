package by.basic.programming_with_classes.aggregation_and_composition.task2_car;

public class Engine {
	private int power;
	private double volume;

	public Engine(int power, double volume) {
		this.power = power;
		this.volume = volume;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
