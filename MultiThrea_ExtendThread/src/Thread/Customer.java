/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author nguye
 */
//demo ve dong bo hoa giua cac thread
public class Customer {

    private int balance = 1000;

    public Customer() {
        System.out.println("Your balance: " + balance);

    }

    private synchronized void withdraw(int amount) {
        System.out.println("transaction withdraw is running " + amount);
        if (balance < amount) {
            System.out.println("Cannot withdraw money");
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
        balance -= amount;
        System.out.println("Withdraw successfully. Your balance is : " + balance);
    }
    private synchronized void deposit(int amount){
        System.out.println("Deposit transaction " + amount + "...");
        balance += amount;
        System.out.println("Deposit successfully. Your balance is " + balance);
        notify();     
    }
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Thread t1 = new Thread(){
            public void run(){
                c1.withdraw(2000);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                c1.deposit(3000);
            }
        };
        t2.start();
       
    }

}
