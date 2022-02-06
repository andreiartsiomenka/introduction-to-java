package by.basic.programming_with_classes.aggregation_and_composition.task5_tourist_vouchers;

public enum Transport {
	PLANE, BUS, TRAIN, SHIP, CAR;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
