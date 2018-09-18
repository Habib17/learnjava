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
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    
 
    
    
    public Customer(Account account){
      this.account = account;  
    }
    
    public Customer(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
    }
    
    public Customer(String firstName, String lastName, Account account){
       this.firstName = firstName;
       this.lastName = lastName;
       this.account = account;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
      this.firstName = firstName;  
    }
    
     public String getLastName(){
        return lastName;
    }
     
     public void setLastName(String lastName){
      this.lastName = lastName;  
    }
     
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public static void main(String[] args) {
        Customer customer1 = new Customer("Emma", "Stones");
        Account account1 = new Account(5000000);
        customer1.setAccount(account1);
        account1.withdraw(3250000);
        account1.deposit(650000);
        account1.withdraw(1450000);
        account1.withdraw(1325000);
        System.out.println(account1.getBalance());
        
        
        
    }
     
    
     
    
}
