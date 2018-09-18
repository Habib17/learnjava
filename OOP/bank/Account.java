/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikfirst;

/**
 *
 * @author ASUS
 */
public class Account {
    
  private int balance;
  public Account(int balance){
      this.balance = balance;
  }
  
  public int getBalance(){
      return balance;
  }
  
  public void deposit(int amount){
     balance = balance + amount;
  }
  
  public void withdraw(int amount){
    if(balance >  amount){
    balance = balance - amount;   
    } 
}
    public static void main(String[] args) {
       Account account1 = new Account(5000000); 
       account1.withdraw(3250000);
       account1.deposit(650000);
       account1.withdraw(1450000);
       account1.withdraw(1325000);
       System.out.println(account1.balance);


    }
  
  
}
