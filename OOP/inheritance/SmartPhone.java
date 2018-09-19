/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ASUS
 */
public class SmartPhone extends Gadget{
    String nameSmartPhone;
    public SmartPhone(String android) {
        nameSmartPhone = android;
    }
    String operatingSistem = "Updating android OS";

    public String getOperatingSistem() {
        return  operatingSistem;
    }
    
    
    public void restart() {
        switchOff();
        switchOn();
    }
    
    @Override
    public void switchOn(){
       System.out.println("Gadget Menyala " + powerOn + " " + nameSmartPhone); 

    }
     @Override
    public void switchOff(){
          System.out.println("Gadget Tidak Menyala " + powerOn + " " + nameSmartPhone);
    }
    public static void main(String[] args) {
        SmartPhone phone  = new SmartPhone("Android");
        System.out.println(phone.nameSmartPhone);
        phone.switchOn();
        System.out.println(phone.getOperatingSistem());
        phone.restart();
        phone.switchOn();
        
    }
}
