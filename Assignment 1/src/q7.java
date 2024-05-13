class q7
{
    public static void main(String[] args)
    {
        int[] list= {4,7,7,5,4,6};
        int max=list[0];
        for(int i=0; i<list.length; i++)
        {
            if(list[i]>max)
                max=list[i];
        }
        int count=0;
        for(int i=0; i<list.length; i++)
        {
            if(list[i]==max)
                count++;
        }
        System.out.println("Maximum value element "+max+" occurs "+count+" times.");
        for(int i=0; i<list.length; i++)
        {
            if(list[i]==max)
            {
                System.out.println("First occurence of maximum value element "+max+" is at index "+i);
                break;
            }
        }
        int min=list[0];
        for(int i=0; i<list.length; i++)
        {
            if(list[i]<min)
                min=list[i];
        }
        count=0;
        for(int i=0; i<6; i++)
        {
            if(list[i]==min)
                count++;
        }
        System.out.println("Minimum value element "+min+" occurs "+count+" times.");
        for(int i=list.length-1; i>0; i--)
        {
            if(list[i]==min)
            {
                System.out.println("Last occurence of minimum value element "+min+" is at index "+i);
                break;
            }
        }
    }
}