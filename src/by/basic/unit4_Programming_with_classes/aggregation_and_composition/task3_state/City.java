package by.basic.programming_with_classes.aggregation_and_composition.task3_state;

public class City {
	private String name;
	private int population;
	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
