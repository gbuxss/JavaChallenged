package Inhertance;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, long employeeId) {
        super(name, birthDate, hireDate);
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }

    public void retire(){

        terminate("12/12/2024");
        isRetired = true;

    }
}
