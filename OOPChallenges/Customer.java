package OOPChallenges;

public class Customer {


    //instance variables
    private String name;
    private double creditLimit;
    private String emailAddress;


    //constructor

    public Customer(String name, double creditLimit, String emailAddress){

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public Customer(){
        this("Default Name", 2424, "default@enail.com");
    }

    public Customer(String name, String emailAddress){
        this(name, 100.00, "email@email.com");
    }


    //getter methods
    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
}
