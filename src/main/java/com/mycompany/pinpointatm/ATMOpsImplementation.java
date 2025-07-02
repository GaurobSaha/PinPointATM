
package com.mycompany.pinpointatm;
import java.util.HashMap;
import java.util.Map;

public class ATMOpsImplementation extends ATM implements ATMOpsInterface {
    ATM atm;
    Map<Double,String>ministatement=new HashMap<>();
    public ATMOpsImplementation (ATM atm){
        this.atm=atm;
    }
    
    public  void viewBalance(){
        System.out.println("Available Balance is: "+atm.getBalance());
    };
    public void withdrawAmount(double withdrawAmount){
        if (atm.getBalance()>=withdrawAmount)
        {
            ministatement.put(withdrawAmount, "Withdrawn");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            System.out.println("Successfully Withdrwan");
            System.out.println("Current Balance is: "+atm.getBalance());
             
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    };
    public void depositAmount(double depositAmount){
        ministatement.put(depositAmount, "Deposited");
        atm.setBalance(atm.getDeposiedAmount()+depositAmount);
        System.out.println("Successfully Deposited");
        System.out.println("Current Balance is: "+atm.getBalance());
        
    };
    public void viewMiniStatement(){
        for (Map.Entry<Double, String> entry : ministatement.entrySet()) {
            System.out.println("Amount: " + entry.getKey() + " --→ " + entry.getValue());
}

    };
    
}
