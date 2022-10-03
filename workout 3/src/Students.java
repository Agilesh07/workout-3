package p2;
import java.util.Scanner;
public class Students
{
    int regno;
    String name;
    Scanner sc=new Scanner(System.in);
    public void readstudent()
    {
        System.out.println("Enter student name");
        name= sc.next();
        System.out.println("Enter the register number");
        regno= sc.nextInt();
    }
    public void showstudent()
    {
        System.out.println("Student in package p2");
        System.out.println("Name :"+name);
        System.out.println("Reg No :"+regno);
    }
}
package p2;
class Faculty
{
    int facid;
    String name;
    Scanner sc=new Scanner(System.in);
    public void readfaculty()
    {
        System.out.println("Enter faculty name");
        name= sc.next();
        System.out.println("Enter the faculty id");
        facid= sc.nextInt();
    }
    public void showfaculty()
    {
        System.out.println("faculty in package p2");
        System.out.println("Name :"+name);
        System.out.println("Faculty ID :"+facid);
    }
}
import p1.*;
class Demo
{
    public static void main(String[] args)
    {
        p1.Student st1=new Student(1601,"Shyam");
        p1.Faculty fc1=new Faculty(5001,"Manoj");
        st1.showstudent();
        System.out.println("-------------------------------");
        fc1.showfaculty();
        System.out.println("-------------------------------");
        p2.Student st2=new p2.Student();
        p2.Faculty fc2=new p2.Faculty();
        st2.readstudent();
        fc2.readfaculty();
        System.out.println("-------------------------------");
        st2.showstudent();
        System.out.println("-------------------------------");
        fc2.showfaculty();
    }
}
