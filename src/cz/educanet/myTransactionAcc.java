package cz.educanet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 8. 10. 2015.
 */
public class myTransactionAcc implements BankAccount{

    List<Integer> a = new ArrayList<Integer>();

    int status = 0;
    @Override
    public int status() {
        for (int i = 0; i<a.size();i++){
            status = status + a.get(i);
        }
        return status;
    }

    @Override
    public void put(int amount) {
        a.add(amount);

    }

    @Override
    public boolean withdraw(int amount) {
        a.add(amount);

        //predpoklada se zaporny amount

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
