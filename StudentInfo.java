/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

public class StudentInfo {
    
    private String idNumber, firstName, lastName, course, major;
    public String college, term, year;
    
    //CONSTRUCTORS
    public StudentInfo(String c, String t, String y){
        this.college = c;
        this.term = t;
        this.year = y;
    }
    
    
    public String getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    public String getfirstName(){
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
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    //print
    public void print(){
        System.out.println("\nUniversity of the Cordilleras");
        System.out.println(college);
        System.out.println(term+", "+year);
        System.out.println("Student Info:");
        System.out.println("ID Number: " + idNumber);
        System.out.println("Name: "+ lastName+", "+firstName);
        System.out.println("Academic Program: " + course+" - "+major+" Track");
    }
}
