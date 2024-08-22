package Banking;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactions){
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(initialTransactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);

    }

    public double sumTransactions(){
        ArrayList<Double>  transactions = getTransactions();
        double sum = 0.0;
        for (Double transaction : transactions){
             sum += transaction;
        }
        return sum;
    }
}
