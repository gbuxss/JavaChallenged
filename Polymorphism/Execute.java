package Polymorphism;

public class Execute {
    public static void main(String[] args) {
       Car car;
       car = new Ford(4, "Fista");
       car.getStatus();
       car = new Holden(5, "landcruser");
       car.getStatus();
       car = new Mitsubishi(7, "Mitsubishi");
       car.getStatus();


    }
}
