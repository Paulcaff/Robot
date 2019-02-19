public class Owner {
    private String name;
    private double monthly_payments;


    public Owner(String name, double mpayment){
        setName(name);
        setMonthlyPayments(mpayment);
    }
    public void setName(String name){
        this.name = name;
    }

    public void setMonthlyPayments(double mpayment){
        this.monthly_payments = mpayment / 12;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyPayments()
    {
        return monthly_payments;
    }

    public String toString() {
        return "Name: " + getName() + " Payments: " + getMonthlyPayments();
    }


}

