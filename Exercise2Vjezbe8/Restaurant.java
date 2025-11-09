package udg.edu.me;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	 private String name;
	    private String address;
	    private String pib;
	    private List<Employee> employees = new ArrayList<>();

	    public Restaurant(String name, String address, String pib) {
	        this.name = name;
	        this.address = address;
	        this.pib = pib;
	    }

	    public void addEmployee(Employee e) {
	        employees.add(e);
	    }

	    public void removeEmployee(int id) {
	        employees.removeIf(e -> e.getId() == id);
	    }

	    public void printMonthlyPayroll(int month, int year) {
	        double total = 0;

	        System.out.println("\nPayroll for " + month + "/" + year);
	        System.out.println("ID | Name | Type | Hours weekly | Extra | Monthly Salary");

	        for (Employee e : employees) {
	            double salary = e.monthlySalary();
	            total += salary;
	            System.out.println(e.id + " | " + e.firstName + " " + e.lastName + " | " + e.getType()
	                    + " | " + e.weeklyHours + " | " + e.extraInfo() + " | " + salary);
	        }

	        System.out.println("Total monthly salary cost: " + total);
	    }
	}

	


