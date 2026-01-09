public class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double bonus;
    private String position;

    public FullTimeEmployee(String name, String employeeId,
                            double monthlySalary, double bonus, String position) {
        super(name, employeeId, monthlySalary);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.position = position;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
        System.out.println("Employee Type: Full-Time");
    }
}
