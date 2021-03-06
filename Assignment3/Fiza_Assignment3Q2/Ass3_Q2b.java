package Fiza_Assignment3Q2;
import java.io.Serializable;

public class Ass3_Q2b {
	class Employee implements Serializable {
		private static final long serialVersionUID = 1L;

		private int id;
		private String name;
		private Address address;
		transient private double salary;

		public Employee(int id, String name, Address address, int salary) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

	}

}

