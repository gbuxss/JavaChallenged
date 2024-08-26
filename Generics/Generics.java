package Generics;

//single generic type class
public class Generics <T>{

    T value;

    public Generics(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

//class Main{
//    public static void main(String[] args) {
//
//        Generics<String> name = new Generics<String>("Jeevan");
//        System.out.println(name.getValue());
//
//        Generics<Integer> rank = new Generics<Integer>(1);
//        System.out.println(rank.getValue());
//
//        GenericsMultiple<String, Integer> genObj = new GenericsMultiple<>("Jeevan", 1);
//        System.out.println("This is from multiple Generic class: " + genObj.getValue());
//        System.out.println("This is from multiple Generic class: " + genObj.getRank());
//
//        //calling generic method
//
//
//    }
//
//}

//multiple generic type class

class GenericsMultiple<T, U>{
    T value;
    U rank;

    public GenericsMultiple(T value, U rank){
        this.value = value;
        this. rank = rank;
    }

    public T getValue(){
        return value;
    }

    public U getRank() {
        return rank;
    }
}

//class containing a generic method
class Test<T>{

      static <T> void genericMethod(T element){

        System.out.println(element.getClass().getName() + " = " + element);


    }

    public static void main(String[] args) {

          //calling generic method
        genericMethod("Jeevan");
        genericMethod(15);
        genericMethod(12.99);


    }
}