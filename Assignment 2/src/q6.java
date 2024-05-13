class q6
{
    public static void main(String[] args)
    {
        cse c= new cse(95,98,100);
        c.getPercent();
        noncse nc= new noncse(90,94,98);
        nc.getPercent();
    }
}
abstract class marks
{
    int markICP, markDSA;
    double percent;
    abstract void getPercent();
}
class cse extends marks
{
    int algoDesign;
    cse(int markICP, int markDSA, int algoDesign)
    {
        this.markICP=markICP;   this.markDSA=markDSA;   this.algoDesign=algoDesign;
    }
    void getPercent()
    {
        percent=(100.0*(markICP+markDSA+algoDesign))/300;
        System.out.println("Total percentage= "+percent+"%");
    }
}
class noncse extends marks
{
    int engmech;
    noncse(int markICP, int markDSA, int engmech)
    {
        this.markICP=markICP;   this.markDSA=markDSA;   this.engmech=engmech;
    }
    void getPercent()
    {
        percent=(100.0*(markICP+markDSA+engmech))/300;
        System.out.println("Total percentage= "+percent+"%");
    }
}