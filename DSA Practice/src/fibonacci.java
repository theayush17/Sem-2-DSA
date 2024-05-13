import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the integer: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        fib(n-2,a,b);
    }
    static void fib(int n, int a, int b){
        if(n==0){
            return;
        }
        int sum=a+b;
        System.out.print(sum+" ");
        fib(n-1,b,sum);
    }
}
