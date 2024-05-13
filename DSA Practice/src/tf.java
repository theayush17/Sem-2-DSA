import java.util.*;
class tf
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Scanner cs= new Scanner(System.in);
        book[] a= new book[3];
        for(int i=0; i<3; i++)
        {
            System.out.print("Book name: ");
            String name= cs.nextLine();
            System.out.print("Book price: ");
            int bp= sc.nextInt();
            System.out.print("Book edition: ");
            int be= sc.nextInt();
            a[i]= new book(name, bp,be);
            a[i].disp();
        }
        int max=a[0].bprice;
        for(int i=0; i<3; i++)
        {
            if(a[i].bprice>max)
            {
                max=a[i].bprice;
            }
        }
        System.out.println("max p: "+max);
    }
}
class book
{
    String bname;
    int bprice, bed;
    book(String bname, int bprice, int bed)
    {
        this.bname=bname;
        this.bprice=bprice;
        this.bed=bed;
    }
    void disp()
    {
        System.out.println(bname);
        System.out.println(bprice);
        System.out.println(bed);
    }
}