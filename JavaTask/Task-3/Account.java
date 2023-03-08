/*
Create a class Account with properties like accountNo, name,
address, phoneNo, dob, balance.
Write getter and setter methods for all properties
Create Parameterized Constructor for class Account.
Create a method closeAccount()
Create a class SavingsAccount which inherits Account class.
Create different methods in SavingsAccount class like withdraw(),
deposit(), fixedDeposit().
Create a class LoanAccount which also inherits Account class.
Create different methods in LoanAccount class like payEMI(),
topUpLoan(), repayment()
 */
import java.util.Date;
class Account{
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private Date dob;
    private double balance;
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    Account(){

    }
    Account(String accountNo, String name, String address, String phoneNo, Date dob, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }
    public void closeAccount() {
        System.out.println("Account closed..");
    }
}
class SavingsAccount extends Account {
    void withdraw(){
        System.out.println("Withdraw..");
    }
    void fixedDeposit(){
        System.out.println("fixedDeposit..");
    }
    void deposit(){
        System.out.println("deposit..");
    }
       
}
class LoanAccount extends Account{
    void payEMI(){
        System.out.println("payEMI..");
    }
    void topUpLoan(){
        System.out.println("topUpLoan..");
    }
    void repayment(){
        System.out.println("repayment..");
    } 
}
    
