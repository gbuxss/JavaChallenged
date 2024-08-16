package MIsc;

public class StringOperations {
    public static void main(String[] args) {

       String name = "Jeevan";

        System.out.println(stringOperation("Jeevan"));
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.length());
        for (int i =0; i < name.length(); i++){
            System.out.println(name.subSequence(i,i+1));
        }





    }

    public static boolean stringOperation(String string){

        return (string.contains("e"));

    }


}
