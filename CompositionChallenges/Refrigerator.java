package CompositionChallenges;

public class Refrigerator {

    private boolean hasWorkTodo;

    public void orderFood(){
        if (hasWorkTodo){
            System.out.println("Ordering food");
            hasWorkTodo = false;
        }
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }
}
