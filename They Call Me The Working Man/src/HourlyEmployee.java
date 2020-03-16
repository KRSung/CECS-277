public class HourlyEmployee extends Employee{
    private int mHoursWorked;
    private double mRateOfPay;

    public HourlyEmployee(String name, int tenure, int hoursWorked, double rateOfPay){
        super(name, tenure);
        mHoursWorked = hoursWorked;
        mRateOfPay = rateOfPay;
    }

    @Override
    public String toString(){
        return "I am " + super.getmName() + ", a HourlyEmployee. I worked " + mHoursWorked + " hours at a rate of $"
                + mRateOfPay + " per hour. I make $" + Math.round(getWages()) + " per month!";
    }

    @Override
    public double getWages() {
        return mHoursWorked * mRateOfPay;
    }
}
