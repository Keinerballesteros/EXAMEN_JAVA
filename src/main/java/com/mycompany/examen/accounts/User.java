
package com.mycompany.examen.accounts;


public class User {
    
    private String name;
    private int age;
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void pay(){
        System.out.println("Solicitud para abonar");
    }
    public void withdraw(){
        System.out.println("Solicitud de retiro");
    }
}
