package Telusko_Java_tutorials;

public class DemoToString {
    public static void main(String[] args) {
         Student s1=new Student(11,"Navin");
         System.out.println(s1);
    }
}
class Student{
    int rollno;
    String sname;
    Student(int rollno,String sname){
        this.rollno=rollno;
        this.sname=sname;
    }

    public String toString(){
        return rollno+" : "+sname;
    }
}