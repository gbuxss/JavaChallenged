package OOPChallenges;

public class BankAccount {

    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private long customerPhoneNumber;


    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositFunds(double depositAmount) {

        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New Balance is $: " + accountBalance);

    }

    public void withdrawFund(double withdrawAmount) {

        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient fund. The account balance is: $" + accountBalance + " .The requested withdrawal amount is: $" + withdrawAmount );
        } else{
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal amount of $ " + withdrawAmount + " has been withdrawan. The new account balance is : $" + accountBalance);
        }


    }

}
