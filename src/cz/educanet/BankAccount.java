package cz.educanet;

/**
 * Created by semanticer on 15. 9. 2015.
 */
public interface BankAccount {
    /**
     * @return Current amount of money on this bank account
     */
    int status();

    /**
     * @param amount of money to add to current state of bank account
     */
    void put(int amount);

    /**
     * This removes specified amount of money from bank accout if possible.
     * If there isn't enough money none will be removed
     * @param amount of money this method will try to withdraw from bank account
     * @return True if there was enough money, False otherwise
     */
    boolean withdraw(int amount);

    /**
     * If possible, specified amount of money will be transferred to target account
     * @param amount
     * @param targetAccount
     * @return
     */
    boolean transfer(int amount, BankAccount targetAccount);
}
