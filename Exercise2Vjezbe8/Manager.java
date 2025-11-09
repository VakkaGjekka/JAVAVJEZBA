package udg.edu.me;

public class Manager extends Employee {

	  private double bonus;

	    public Manager(int id, String firstName, String lastName, double hourlyRate, double weeklyHours, double bonus) {
	        super(id, firstName, lastName, hourlyRate, weeklyHours);
	        this.bonus = bonus;
	    }

	    @Override
	    public double monthlySalary() {
	        return 1300 + (weeklyHours * hourlyRate * 4) + bonus;
	    }

	    @Override
	    public String getType() { return "Manager"; }

	    @Override
	    public String extraInfo() { return "Bonus: " + bonus; }
	
}
