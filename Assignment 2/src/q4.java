class q4
{
    public static void main(String[] args)
    {
        deposit d1= new deposit();
        d1.display();   d1.calAmt();
        deposit d2= new deposit(500000, 4, 15.6);
        d2.display();   d2.calAmt();
        deposit d3= new deposit(300000,1);
        d3.display();   d3.calAmt();
        deposit d4= new deposit(900000, 18.9);
        d4.display();   d4.calAmt();
    }
}
class deposit
{
    long p;
    int t;
    double r, totalAmt;
    deposit()
    {
        p=5000;
        t=3;
        r=5.5;

    }
    deposit(long p, int t, double r)
    {
        this.p=p;
        this.t=t;
        this.r=r;
    }
    deposit(long p, int t)
    {
        this.p=p;
        this.t=t;
    }
    deposit(long p, double r)
    {
        this.p=p;
        this.r=r;
    }
    void display()
    {
        System.out.println("Principal= "+p);
        System.out.println("Rate= "+r+"%");
        System.out.println("Time= "+t+" yrs");
    }
    void calAmt()
    {
        totalAmt=((p*r*t)/100)+p;
        System.out.println("Total amount= "+totalAmt+"rs");
        System.out.println();
    }
}