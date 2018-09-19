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
public class SmartWatch  extends Gadget {

     String gps = "Menyala";
     String nameSmartWatch;
    public SmartWatch(String pebble) {
       nameSmartWatch = pebble;
    }
     @Override
    public void switchOn(){
         System.out.println("Gadget Menyala " + powerOn + " " + nameSmartWatch); 
    }

    public void switchOnGps(){
        System.out.println("GPS " + gps);
    }
    public void switchOffGps(){
        System.out.println("GPS Tidak " + gps);
    }
    
     @Override
    public void switchOff(){
          System.out.println("Gadget Tidak Menyala " + powerOn + " " + nameSmartWatch);
    }
    public static void main(String[] args) {
        SmartWatch pebble = new SmartWatch("Pebble");
        System.out.println(pebble.nameSmartWatch);
        pebble.switchOn();
        pebble.switchOnGps();
        pebble.switchOffGps();
        pebble.switchOff();
    }
}
