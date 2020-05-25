public class Savings extends Account{
    // List properties specific to Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    //Constructor 
    public Savings(String name,String SSN,double initDeposit){
        super(name,SSN,initDeposit);
        accountNumber ="1"+accountNumber;
        setSafetyDepositeBox();
    }
    @Override
    public void setRate(){
        rate= getBaseRate() - .25;
    }

    private void setSafetyDepositeBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        // System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }
     public void showInfo(){
        // System.out.println("Account type is Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features:" +
        "\nSafety DepositBoxID:  "+safetyDepositBoxID+
        "\nSafety Deposit Box Key:  "+safetyDepositBoxKey);
    }
}