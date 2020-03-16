import java.util.Collection;

public class SupervisorEmployee extends Employee {
    private double mBonusPercentage;
    private Collection<Employee> mEmployeeCollection;

    public SupervisorEmployee (String name, int tenure, Collection<Employee> employeeCollection,
                               double bonusPercentage) {
        super(name, tenure);
        mEmployeeCollection = employeeCollection;
        mBonusPercentage = bonusPercentage;
    }

    @Override
    public double getWages(){
        double maxWage = 0;
        for(Employee i: mEmployeeCollection){
            if (i.getWages() > maxWage){
                maxWage = i.getWages();
            }
        }
        return maxWage * (1 + mBonusPercentage / 100);
    }

    @Override
    public String toString(){
        String tempString = "I am " + super.getmName() + ", a SupervisorEmployee. I supervise ";

        for(Employee i: mEmployeeCollection){
            tempString += i.getmName() + ", ";
        }

        tempString += "and I have a bonus percentage of " + mBonusPercentage +
                "%. I make $" + Math.round(getWages()) + " per month!";

        return tempString;
    }
}
