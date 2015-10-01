package cz.educanet;

/**
 * Created by Jakub Janoušek on 1. 10. 2015.
 */
public class MyBankAccount implements BankAccount {

    public int status = 0;
    @Override
    public int status() {
        return status;
    }

    @Override
    public void put(int amount) {
        status = status+amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (status>=amount) {
            status = status - amount;
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean transfer(int amount, BankAccount targetAccount) {
        if (withdraw(amount)) {
            targetAccount.put(amount);
            return true;
        }else{
            return false;
        }
    }
}
