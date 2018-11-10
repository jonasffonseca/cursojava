package entities;

public class Employee2 {
	private int id;
	private String name;
	private Double salary;

	public Employee2(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(Double percentage) {
		salary += salary * percentage / 100.0;
	}

	public String toString() {
		return id + ", " + name + ", " + salary;
	}

}
