package by.basic.programming_with_classes.aggregation_and_composition.task5_tourist_vouchers;

public enum TypeOfFood {
	NOT_INCLUDET, BREAKFAST, ALL_INCLUSIVE;

	@Override
	public String toString() {
		return super.toString().replace('_', ' ').toLowerCase();
	}
}
