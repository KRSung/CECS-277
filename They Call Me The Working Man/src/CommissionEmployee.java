public class CommissionEmployee extends Employee {
    private double mCommissionPercentage;
    private double mTotalAmntOfMonthlySales;
    private int mBaseSalary;

    public CommissionEmployee(String name, int tenure, int baseSalary, double totalAmntOfMonthlySales,
                              double commissionPercentage){
        super(name, tenure);
        mCommissionPercentage = commissionPercentage;
        mTotalAmntOfMonthlySales = totalAmntOfMonthlySales;
        mBaseSalary = baseSalary;
    }

    @Override
    public double getWages(){
        return mBaseSalary + (mTotalAmntOfMonthlySales * mCommissionPercentage / 100);
    }

    @Override
    public String toString(){
        return "I am " + super.getmName() + ", a CommissionEmployee. I make $" + mBaseSalary +
                " as a base salary with commission percentage of " + mCommissionPercentage +
                "%. I had $" + (int)mTotalAmntOfMonthlySales + " monthly sales. I make $" + Math.round(getWages())
                + " per month!";
    }

}
