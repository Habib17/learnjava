/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
/* class definition syntax 
[modifier] class ClassName{
[attributes-declaration](atributes/state/data/field)
[constructor-declaration]
[method-declaration]
}
*/
public class Student {
/* Variable Declaration 
[modifier] type variableName [=initial value];
*/
    public String name="yoga"; //Global Variable
    public int age=22; //Global Variable
 /*Contrains using final keyword */
  public final int tall=165;
  /*Method Declaration (behavior, function, operation)
 [modifier] returntype methodName([arguments]){
   [statements] 
  }
 */
    public void info(){
        String name="Habib";  //local variable
        System.out.println("My name is " + name); //it will print Habib
    }
    public void data(){
        System.out.println("My name is " + this.name);
    }
    //local variable
    public void info(String name){
      
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        /*Member of Object 
   (variables and methods)
   can be accessed with the dot operator:
    <object>.<member>
    */
    Student student = new Student();
    Student student1 = new Student();
    student.name ="Fulan";
    /*
    error
    student.tall =167;
    */
    student.info(); //print method info with local variable
    student1.data();  //print method info with global variable
    student.data();  //print method info with local variable name replace by fulan name

    
    
    }
    
}
