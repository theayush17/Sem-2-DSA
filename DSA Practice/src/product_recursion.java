import java.util.*;
public class product_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(product(a,b));
    }
    static int product(int a, int b){
        if(b==0)
            return b;
        return a+product(a,b-1);
    }
}

