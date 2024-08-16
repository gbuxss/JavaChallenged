package Inhertance;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, long employeeId) {
        super(name, birthDate, hireDate);
    }

    public void getDoublePay(){
        System.out.println("This is a double pay method");

    }
}
