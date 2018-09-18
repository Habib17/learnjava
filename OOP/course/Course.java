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
public class Course {
   private String name;
   private Lecturer lecturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
   
   public Course(String name, Lecturer lecturer){
     this.name = name;
     this.lecturer = lecturer;
   }
   
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Dennis Ritchie");
        Lecturer lecturer2 = new Lecturer("Tim Lee");
        Lecturer lecturer3 = new Lecturer("Dennis Ritchie");

        Course course1 = new Course("Java Programming", lecturer1);
        Course course2 = new Course("Web Programming", lecturer2);
        Course course3 = new Course("Web Design", lecturer2);
        Course course4 = new Course("Database", lecturer3);
        
        Student student1 = new Student("175150209111014" ,"John Doe");
        student1.addCourse(course1);
        student1.addCourse(course2);
      student1.addCourse(course3);
      
      Student student2 = new Student("175150209111017" ,"Edgar Alan");
      student2.addCourse(course1);
      student2.addCourse(course2);
      student2.addCourse(course3);
      student2.addCourse(course4);
        
      student1.printCourse();



 

        
    }
}
