public class Contractor extends Employee {

    private double contractFee;
    private int contractDuration;
    private String companyName;

    public Contractor(String name, String employeeId,
                      double contractFee, int contractDuration, String companyName) {
        super(name, employeeId, contractFee);
        this.contractFee = contractFee;
        this.contractDuration = contractDuration;
        this.companyName = companyName;
    }

    @Override
    public double calculateSalary() {
        return contractFee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company: " + companyName);
        System.out.println("Contract Duration: " + contractDuration + " months");
        System.out.println("Employee Type: Contractor");
    }
}
