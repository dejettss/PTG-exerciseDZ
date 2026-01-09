public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;
    private String shift;

    public PartTimeEmployee(String name, String employeeId,
                            int hoursWorked, double hourlyRate, String shift) {
        super(name, employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.shift = shift;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shift: " + shift);
        System.out.println("Employee Type: Part-Time");
    }
}
