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
    //access constructor use name
    Student student3 = new Student("Adi");
    student.name ="Fulan";
    // three ways of instatiation
    Student s1 = new Student("Adi");
    Student s2 = new Student(20);
    Student s3 = new Student("Ali", 21);

    /*
    error
    student.tall =167;
    */
    student.info(); //print method info with local variable
    student1.data();  //print method info with global variable
    student.data();  //print method info with local variable name replace by fulan name

    
    //check if an object is an instance of a class
    //instanceof if there are object can use  ==
    if(student instanceof Student){
        System.out.println("Mereka adalah instance");
    }
    //calling constructor
    new Student();
    }
    
 /*
Constuctors are special methods
that have the same name
as the class name
Constuctors don’t
return any values
    */
    public Student() {
        System.out.println("Constructor dipanggil");
            /*Constructors are useful
        for initializing variables
         */
         name = "nama constructor";
	}
    //Constructors can have parameters
    public Student(String name) {
		this.name = name;
                //call constructor
                //this(name, 20);

	}
       //constructor overloaded
    public Student(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}



}
/*
We don’t have to import classes
located in java.lang package

Classes in java.lang package:
Object
System
String
Math
Wrapper classes
Exception
Thread
*/