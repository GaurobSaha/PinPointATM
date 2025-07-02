
package com.mycompany.pinpointatm;
/**
 *
 * @author Gaurob Saha
 */

import java.util.Scanner;

public class PinPointATM {

    public static void main(String[] args) {
    int atmnumber = 12345;
    int atmpin = 123;
    
    System.out.println("Welcome To The PinPoinTATM!!!");
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Atm Number : ");
    int atmNumber = in.nextInt();
    System.out.print("Enter Pin: ");
    int pin = in.nextInt();

    if ((atmnumber == atmNumber) && (atmpin == pin)) {
        System.out.println("Validation Done Successfully.");
        
        ATM atm=new ATM();
        ATMOpsImplementation atmops= new ATMOpsImplementation(atm);
        
        while(true){
            System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Ministatement\n5. Exit");
            System.out.println("Enter Choice : ");
            int ch = in.nextInt();
            if(ch==1){
                atmops.viewBalance();
            }
            else if(ch==2){
                System.out.println("How much money do you want to withdraw?\n");
                double amount = in.nextDouble();
                atmops.withdrawAmount(amount);

            }
            else if(ch==3){
                System.out.println("How much money do you want to deposit?\n");
                double amount = in.nextDouble();
                atmops.depositAmount(amount);

            }
            else if(ch==4){
                atmops.viewMiniStatement();
            }
            else if(ch==5){
                System.out.println("\"Collect your ATM Card\\n Thank you\"");
                System.exit(0);
                    }
            else{
                System.out.println("Please enter correct choice");
            }
    } 
    }
    else {
        System.out.println("Either Incorrect Atm Number or pin.");
        System.exit(0);
    }

    }
}

