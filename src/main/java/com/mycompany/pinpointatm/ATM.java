
package com.mycompany.pinpointatm;

public class ATM {
    private double balance=0.0;
    private double depositedAmount=0.0;
    private double withdrawnAmount=0.0;
    
    
    public void setBalance(double balance){
        this.balance=balance;  
    }
    public double getBalance(){
        return balance;
    }
     public void setDeposiedAmount(double depositedAmount){
        this.depositedAmount = depositedAmount;
    }
    public double getDeposiedAmount(){
        return depositedAmount;
    }
     public void setWithdrawnAmount(double withdrawnAmount ){
        this.withdrawnAmount=withdrawnAmount;
    }
    public double getWithDrwanAmount(){
        return withdrawnAmount;
    }
    
        


}
