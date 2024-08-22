package Banking;

import java.util.*;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initialTransaction);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {

            System.out.println("Customer details for branch ".toUpperCase() + branch.getName());
            System.out.println("_".repeat(50));
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                if(transactions){
                    System.out.println("Transactions");
                    System.out.println("[" + (i+1) + "] Amount " + branch.getCustomers().get(i).sumTransactions());
                    System.out.println("_".repeat(50));
                }

            }
            return true;
        }

        return false;
    }
}
