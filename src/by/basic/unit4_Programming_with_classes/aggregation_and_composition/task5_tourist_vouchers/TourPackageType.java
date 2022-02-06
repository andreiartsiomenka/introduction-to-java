package by.basic.programming_with_classes.aggregation_and_composition.task5_tourist_vouchers;

public enum TourPackageType {
	RECREATION, EXCURSION, TREATMENT, SHOPPING, CRUISE;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
