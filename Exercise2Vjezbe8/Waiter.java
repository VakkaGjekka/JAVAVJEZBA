package udg.edu.me;

public class Waiter extends Employee {
	private double overtimeHours;

    public Waiter(int id, String firstName, String lastName, double hourlyRate, double weeklyHours, double overtimeHours) {
        super(id, firstName, lastName, hourlyRate, weeklyHours);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double monthlySalary() {
        double weeklyPay = weeklyHours * hourlyRate;
        double overtimePay = overtimeHours * (hourlyRate * 1.2);
        return (weeklyPay + overtimePay) * 4;
    }

    @Override
    public String getType() { return "Waiter"; }

    @Override
    public String extraInfo() { return "Overtime: " + overtimeHours + "h weekly"; }
}

	
	

	