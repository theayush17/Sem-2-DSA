import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name and marks of student: ");
        String n=sc.nextLine();
        int m=sc.nextInt();
        try{
            if(m>100)
            {
                throw new MarksOutOfBoundException();
            }

            else
            {
                student s1=new student(m,n);
                s1.display();
            }
        }
        catch(MarksOutOfBoundException e){
            e.despo();
        }
    }
}
class student{
    int marks;
    String name;
    student(int marks, String name){
        this.name=name;
        this.marks=marks;
    }
    void display(){

        System.out.println("Student name: "+name+"\nMarks obtained: "+marks);
    }
}
class  MarksOutOfBoundException extends Exception
{
    void despo()
    {
        System.out.println("utsav mc bc rc pc dc kc lc");
    }
}
