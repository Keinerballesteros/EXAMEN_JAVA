
package com.mycompany.examen.accounts;



public class AccountYoungerAge extends User{
    private double balance;
    private User user;
    public AccountYoungerAge(String name, int age, User user) throws Exception {
        super(name, age);
        this.user = user;
        if(age>=14){
            System.out.println("Cuenta creada");
        this.balance = 100;
        }
        else{
            throw new Exception("Error no fue posible crear su cuenta");
    }
    }
    
    
    public void pay(double cash){
        System.out.println("Abono exitoso");
        balance += cash;
    }
    
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
    

