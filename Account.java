public abstract class Account implements iBaseRate{
    //List common properties for savings and checking account
    private String name;
    private String SSN;
    private double balance;
    private static int index =10000;
    protected String accountNumber;
    protected double rate;
    //Constructor to set base properties and initalize the account
    public Account(String name,String SSN,double initDeposit){
        this.name= name;
        this.SSN = SSN;
        balance = initDeposit;
        // System.out.println("Name: " + name + "  SSN " + SSN + "  Balance $" + 
        // balance);
        // System.out.println("Name:" + name);
        // System.out.print("New Account:");
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
        // System.out.println("Account number:  " + this.accountNumber);
    }
    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoSSN = SSN.substring(SSN.length()-2,SSN.length());
        int uniqueID= index;
        int randomNumber = (int)(Math.random() *Math.pow(10,3));
        return lastTwoSSN + uniqueID +randomNumber;

    }
    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance = balance +accuredInterest;
        System.out.println("AccuredInterest:$"+accuredInterest);
        printBalance();
    }
    //list of Common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $:"+amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $:"+amount);
        printBalance();
    }
    public void transfer(String toWhere,double amount){
        balance = balance - amount;
        System.out.println("Transfering $: "+amount + " to "+toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now:$"+balance);
    }

    public void showInfo(){
        System.out.println(
               "NAME:  "+name+
               "\nAccount number: "+accountNumber+
               "\nBalance: "+balance+
               "\nRate:  "+rate +"%");
    }

}