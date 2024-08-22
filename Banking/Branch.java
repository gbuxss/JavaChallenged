package Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        return null;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        if (findCustomer(name) != null) {
            Customer customer = findCustomer(name);
            assert customer != null;
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }


}
