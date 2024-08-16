package Inhertance;

public class Main {

    public static void main(String[] args){

//        Employee john = new Employee("John", "11/30/1992", "08/21/2021");
//
//        System.out.println(john);
//        System.out.println(john.getAge());
//        System.out.println(john.collectPay());
//
//        Employee Tim = new Employee("Tim", "11/30/1992", "08/21/2021");
//        System.out.println(Tim);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        //HourlyEmployee joh = new HourlyEmployee();
//        joh.getAge();
//        joh.collectPay();
//        joh.getDoublePay();

    }
}
