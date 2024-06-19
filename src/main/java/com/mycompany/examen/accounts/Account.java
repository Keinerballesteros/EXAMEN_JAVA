
package com.mycompany.examen.accounts;


public class Account extends User implements Actions{
    private Type type;
    private double balance;
    private double debt;
    private double compesation;
    public Account(String name, int age, Type type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void pay(double cash) {
        if(type == Type.EMPLOYEE){
            compesation += cash*0.1;
        }
        debt -= cash;
        System.out.println("Le resta por pagar: "+debt);
    }

    @Override
    public void credit(double cash, User user,String contract) {
        balance += cash;
        debt += cash *1.1;
        System.out.println("Credito aprobado");
        System.out.println("Su credito final es de: "+debt);
    }

    @Override
    public void withdraw(double cash) {
        if(cash>balance){
            System.out.println("No tiene esa cantidad en su cuenta");
        }
        else{
            System.out.println("Proceso Realizado");
            balance -= cash;
            System.out.println("Su saldo es de: "+balance);
        }
    }

    
    
    
}
