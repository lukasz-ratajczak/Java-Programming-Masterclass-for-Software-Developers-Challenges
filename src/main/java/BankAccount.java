public class BankAccount {
    private Long accountNumber, balance;
    private int phoneNumber;
    private String customerName, email;

    public BankAccount() {
        System.out.println("nothin to see");
    }

    public BankAccount(Long accountNumber, Long balance, int phoneNumber, String customerName, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public void deposit(Long deposit){
        System.out.println("You "+customerName+" want to deposit "+ deposit+"$");
        if(balance == null){
            balance = 0L;
        }
        balance = balance + deposit;
        System.out.println("Your new balance is "+balance+"$");
    }
    public void withdraw(Long withdraw){
        System.out.println("You "+customerName+" want to deposit "+ withdraw+"$");
        if(balance >= withdraw){
            balance = balance - withdraw;
            System.out.println("Your new balance is "+balance+"$");
        } else{
            System.out.println("You've got too less money :(");
        }
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
