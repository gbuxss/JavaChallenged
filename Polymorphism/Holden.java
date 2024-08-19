package Polymorphism;

public class Holden extends Car{

    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getClass().getSimpleName()+"-> Holden Engine is running");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName()+ "-> Holden is accelerating");
    }

    @Override
    public void brake() {

        System.out.println(this.getClass().getSimpleName()+ "-> Holden is braking");

    }
}
