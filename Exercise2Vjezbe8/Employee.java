package udg.edu.me;

public abstract class Employee {
	protected int id;
    protected String firstName;
    protected String lastName;
    protected double hourlyRate;
    protected double weeklyHours;

    public Employee(int id, String firstName, String lastName, double hourlyRate, double weeklyHours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }
    

	


	





	public int getId() { return id; }

    public abstract double monthlySalary();
    public abstract String getType();
    public abstract String extraInfo();


}

