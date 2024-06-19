

package com.mycompany.examen;

import com.mycompany.examen.accounts.Account;
import com.mycompany.examen.accounts.AccountYoungerAge;
import com.mycompany.examen.accounts.Type;
import com.mycompany.examen.accounts.User;


public class EXAMEN {

    public static void main(String[] args) throws Exception {
        User user = new User("Keiner", 20);
        Account account = new Account("Juan", 18, Type.CLIENT);
        Account accountTwo = new Account("Marco", 18, Type.EMPLOYEE);
        account.credit(2000, user, "Contrato");
        accountTwo.credit(2000, user, "Administrador");
        account.pay(500);
        accountTwo.pay(100);
         account.withdraw(200);
        account.withdraw(90);
        AccountYoungerAge niño = new AccountYoungerAge("Juan", 15, user);
        niño.pay(100);
        niño.withdraw(50);
    }
}
