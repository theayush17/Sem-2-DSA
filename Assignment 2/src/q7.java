import java.util.*;
class q7
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        person2 p= new person2(name);
        p.count();
        p.display();
    }
}
interface DetailInfo
{
    void display();
    void count();
}
class person2 implements DetailInfo
{
    static int maxcount=0;
    String name;
    person2(String name)
    {
        this.name=name;
    }
    public void count()
    {
        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)!=' ')
                maxcount++;
        }
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Number of characters in your name: "+maxcount);
    }
}