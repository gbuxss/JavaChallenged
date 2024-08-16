package CompositionChallenges;

public class DishWasher {
    private boolean hasWorkToDo;

    public void  doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
