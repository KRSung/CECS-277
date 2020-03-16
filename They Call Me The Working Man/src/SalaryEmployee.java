public class SalaryEmployee extends Employee{
    private int mMonthlySalary;

    public int getmMonthlySalary(){
        return mMonthlySalary;
    }

    public SalaryEmployee(String name, int tenure, int monthlySalary){
        super(name, tenure);
        mMonthlySalary = monthlySalary;
    }

    @Override
    public String toString(){
        return "I am " + super.getmName() + ", a SalaryEmployee. I make $" + Math.round(getWages()) + " dollars per month!";
    }

    @Override
    public double getWages() {
        return mMonthlySalary;
    }
}
