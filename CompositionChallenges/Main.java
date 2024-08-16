package CompositionChallenges;

public class Main {

    public static void main(String[] args) {

        SmartKitchen sm = new SmartKitchen();
        sm.setKitchenState(true, true,true);
        sm.doKitchenWork();
    }
}
