package udg.edu.me;

public class Cook extends Employee {

	public Cook(int id, String firstName, String lastName, double hourlyRate, double weeklyHours) {
        super(id, firstName, lastName, hourlyRate, weeklyHours);
    }

    @Override
    public double monthlySalary() {
        return 1500 + (weeklyHours * hourlyRate * 4);
    }

    @Override
    public String getType() { return "Cook"; }

    @Override
    public String extraInfo() { return "Bonus: 1500"; }
}
