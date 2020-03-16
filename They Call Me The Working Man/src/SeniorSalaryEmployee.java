public class SeniorSalaryEmployee extends SalaryEmployee {
    public SeniorSalaryEmployee(String name, int tenure, int monthlySalary){
        super(name, tenure, monthlySalary);
    }

    @Override
    public double getWages(){
        int tenureAfterTen = 0;
        if (super.getmTenure() - 10 > tenureAfterTen){
            tenureAfterTen = super.getmTenure() - 10;
        }
        return getmMonthlySalary() / 12 * Math.pow(1.03, tenureAfterTen);
    }

    @Override
    public String toString(){
        return "I am " + super.getmName() + ", a SeniorSalaryEmployee. I have a base salary of $"
                + getmMonthlySalary() / 12 + " per month, and a tenure of " + super.getmTenure() + " years. I make $" +
                Math.round(getWages()) + " per month!";
    }
}
