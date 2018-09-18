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

//Masih Error
public class Student {
    private String nim;
    private String name;
    private Course[] course = new Course[3];
    int i = 0;
    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCourse(Course course){
        if(i < this.course.length){
          this.course[i]= course;
      }
         i++;
      
    }
     public void printCourse(){
         for(int k = 0 ; k < i ; k++){
             System.out.println("Mahasiswa "+ getName() +" Jadi dosennya "+ course[k].getLecturer().getName() + " dan pelajarannya "  +course[k].getName()); 
         }
     }
}
