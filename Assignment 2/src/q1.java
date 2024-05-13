import java.util.*;
class q1
{
    public static void main(String[] args)
    {
        person p1= new person();
        p1.setData("Rohan",20);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        person p2= new person();
        p2.setData(name,age);
        p1.displayData();
        p2.displayData();
    }
}
class person
{
    String name;
    int age;
    void setData(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void displayData()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}