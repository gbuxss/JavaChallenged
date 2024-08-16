package Inhertance;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        //write code to calculate age
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);

    }

    public double collectPay() {
        //write code to collect pay
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
