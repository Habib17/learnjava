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
public class Gadget {
    boolean powerOn = true;
    public void switchOn(){
        System.out.println("Gadget Menyala " + powerOn);
              
    }
    public void switchOff(){
        powerOn =false;
        System.out.println("Gadget Menyala " + powerOn);
    }

}
