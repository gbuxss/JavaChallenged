package Polymorphism;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public void startEngine() {

        System.out.println(this.getClass().getSimpleName()+"-> Mitsubishi Engine is running");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName()+ "-> Mitsubishi is accelerating");
    }

    @Override
    public void brake() {

        System.out.println(this.getClass().getSimpleName()+ "-> Mitsubishi is braking");

    }
}
