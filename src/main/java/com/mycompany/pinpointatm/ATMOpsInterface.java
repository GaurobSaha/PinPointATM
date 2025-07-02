
package com.mycompany.pinpointatm;

public interface ATMOpsInterface {
    public abstract void viewBalance();
    public abstract void withdrawAmount(double withdrawAmount);
    public abstract void depositAmount(double depositAmount);
    public abstract void viewMiniStatement();
}

