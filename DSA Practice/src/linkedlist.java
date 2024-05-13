import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("***MENU****");
            System.out.println("0.Exit");
            System.out.println("1.Create");
            System.out.println("2.Display");
            int c=sc.nextInt();
            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    node.create();
                    break;
                case 2:
                    node.display();
                    break;
                default:
                    System.out.println("Wrong Choice !!");
                    break;
            }
            sc.close();
        }   
    }
}
class node{
    int info;
    node next;
    public static node start=null;
    static void create(){
        Scanner sc=new Scanner(System.in);
        node p=new node();
        System.out.println("Enter info: ");
        p.info=sc.nextInt();
        p.next=null;
        start=p;
        node q=p;
        System.out.println("Do you want to enter more values? (Y/N): ");
        char c=sc.next().charAt(0);
        while(c!='n'){
            p=new node();
            System.out.println("Enter info: ");
            p.info=sc.nextInt();
            p.next=null;
            q.next=p;
            q=p;
            System.out.println("Do you want to enter more values? (Y/N): ");
            c=sc.next().charAt(0);
        }
        sc.close();
    }
    static void display(){
        node p=start;
        System.out.println("Values are: ");
        while(p!=null){
            System.out.print(p.info+" ");
            p=p.next;
        }
    }
}
