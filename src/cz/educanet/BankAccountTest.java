package cz.educanet;

import static org.junit.Assert.*;

/**
 * Created by semanticer on 15. 9. 2015.
 */
public class BankAccountTest {

    @org.junit.Test
    public void testPut() throws Exception {

        // setup
        BankAccount ba = new MyBankAccount();

        // exercise
        ba.put(1000);
        int result = ba.status();

        // verify
        assertEquals(1000, result);
    }

    @org.junit.Test
    public void testWithdraw() throws Exception {

        // setup
        BankAccount ba = new MyBankAccount();

        // exercise
        ba.put(1000);
        boolean falseResult = ba.withdraw(1001);
        boolean trueResult = ba.withdraw(600);
        int currentAmount = ba.status();

        // verify
        assertFalse(falseResult);
        assertTrue(trueResult);
        assertEquals(400, currentAmount);

    }

    @org.junit.Test
    public void testTransfer() throws Exception {
        // setup
        BankAccount ba = new MyBankAccount();
        BankAccount ba2 = new MyBankAccount();
        // exercise
        ba.put(1000);
        ba2.put(500);
        boolean falseResult = ba.transfer(1001, ba2);
        boolean trueResult = ba.transfer(200, ba2);
        int firstState = ba.status();
        int secondState = ba2.status();

        // verify
        assertFalse(falseResult);
        assertTrue(trueResult);
        assertEquals(800, firstState);
        assertEquals(700, secondState);

    }
}