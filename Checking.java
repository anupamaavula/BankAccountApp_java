

public class Checking extends Account{
    //List properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;
    //constructor to initialize checking account properties
    public Checking(String name,String SSN,double initDeposit){
        super(name,SSN,initDeposit);
        accountNumber = "2" + accountNumber;
        // System.out.println("New Checking Account:");
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    //List any methids specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Feature:"+
        "\nDebitCard Number:  "+debitCardNumber+
        "\nDebitCard Pin:  "+debitCardPin);
    }

}