import java.util.ArrayList;

public class PayrollSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Abdul", "FOP1002", 4500, 500, "Deputy Director"));

        employees.add(new PartTimeEmployee("Bambang", "COMATH1001", 15, 20, "Evening"));

        employees.add(new Contractor("Septian", "CSO1003", 23500, 6, "SawitJayaJawaMakmur"));

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Salary: $" + emp.calculateSalary());
            System.out.println("----------------------------------");
        }
    }
}
