package Polymorphism;

public class Ford extends Car {

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + "-> Ford Engine is running");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + "-> Ford is accelerating");
    }

    @Override
    public void brake() {

        System.out.println(this.getClass().getSimpleName() + "-> Ford is braking");

    }


}
