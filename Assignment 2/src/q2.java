class q2
{
    public static void main(String[] args)
    {
        complex c1= new complex();
        c1.real=4;  c1.imag=7;
        complex c2= new complex();
        c2.real=6;  c2.imag=3;
        c1.display();
        c2.display();
    }
}
class complex
{
    int real, imag;
    void setData(int real, int imagh)
    {
        this.real=real;
        this.imag=imag;
    }
    void display()
    {
        System.out.println("Complex number geneated is: "+real+"+"+imag+"i");
    }
}