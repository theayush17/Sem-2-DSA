import java.util.*;
class q2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("Enter height in m: ");
        double h= sc.nextDouble();
        double BMI= w/(h*h);
        if(BMI<18.5)
            System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<=24.9)
            System.out.println("Normal weight");
        else if(BMI>=25 && BMI<=29.9)
            System.out.println("OverWeight");
        else
            System.out.println("Obese");
    }
}