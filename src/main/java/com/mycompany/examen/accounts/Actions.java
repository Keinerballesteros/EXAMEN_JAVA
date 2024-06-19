
package com.mycompany.examen.accounts;


public interface Actions {
    public void pay(double cash);
    public void credit(double cash, User user,String contract );
    public void withdraw(double cash);
}
