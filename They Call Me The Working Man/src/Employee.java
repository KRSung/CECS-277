import java.util.ArrayList;
import java.util.Collection;

public abstract class Employee {
    private String mName;
    private int mTenure;

    public Employee(String name, int tenure){
        mName = name;
        mTenure = tenure;
    }

    public String toString(){
        return "I'm an employee, whee!";
    }

    public String getmName(){
        return mName;
    }

    public int getmTenure(){
        return mTenure;
    }

    public abstract double getWages();

    public static void main(String[] args) {
        HourlyEmployee Pam = new HourlyEmployee("Pam Beesly", 5, 40, 10);
        SalaryEmployee Angela = new SalaryEmployee("Angela Martin", 10, 4500);
        CommissionEmployee Dwight = new CommissionEmployee("Dwight K. Shrute", 11, 2000,
                40000, 10);
        SeniorSalaryEmployee Todd = new SeniorSalaryEmployee("Todd Packer", 18, 50000);

        Collection<Employee> employeeCollection = new ArrayList<Employee>();
        employeeCollection.add(Pam);
        employeeCollection.add(Angela);
        employeeCollection.add(Dwight);
        employeeCollection.add(Todd);
        SupervisorEmployee Michael = new SupervisorEmployee("Michael L. Scott", 19, employeeCollection,
                20);

        System.out.println(Pam);
        System.out.println(Angela);
        System.out.println(Dwight);
        System.out.println(Todd);
        System.out.println(Michael);
    }
}
