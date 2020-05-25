import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        //REad csv file then create a account based on that data
        List<Account> accounts = new LinkedList<Account>();
        String file="C:\\WIN_PROGRAM\\Week11_Java\\Day5Lab_JavaProjects\\BankApp\\NewBankAccounts.csv";
        
        List<String []> newAccountHolders = csv.read(file);
        for(String[] accountHolder : newAccountHolders){
            // System.out.println("New Account");
            String name= accountHolder[0];
            String SSN=accountHolder[1];
            String accountType =accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            
            if(accountType.equals("Savings"))
            {
                accounts.add(new Savings(name,SSN,initDeposit));
            }
            else if(accountType.equals("Checking")) {
               accounts.add(new Checking(name,SSN,initDeposit));
            }
            else{
                System.out.println("Error reading Account type");
            }
        
        }
         for(Account acc : accounts){
            System.out.println("\n*****************");
            acc.showInfo();
        }

        // Checking checkacc1 = new Checking("Tom Martin","323323212",1500);

        // Savings saveacc1 = new Savings("Rich man","456678974",2000);
        // // saveacc1.compound();
        
        // saveacc1 . showInfo();
        // System.out.println("**********************");
        // checkacc1.showInfo();

        // saveacc1.compound();

        // saveacc1.deposit(5000);
        // saveacc1.withdraw(200);
        // saveacc1.transfer("Brokerage", 3000);

    }
}