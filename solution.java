import java.util.Scanner;

class solution 
{
    static void colcamount(int day,int eve,int nyt)
    {
        float samt=eve*0.2f+nyt*0.15f;
        float gamt=eve*0.3f+nyt*0.2f;
        if(day>120)
            samt+=samt+(day-120)*0.3f;
        if(day>200)
            gamt+=gamt+(day-200)*0.4f;
        System.out.println(samt);
        System.out.println(gamt);
        if(samt<gamt)
            System.out.println("silver plan is enonomical");
        else if(gamt<samt)
            System.out.println("gold plan is economical");
        else
            System.out.println("both plans are same");
    }
    class plan 
    {
    public static void main(String[] args) 
        {
            try (Scanner ip = new Scanner(System.in)) {
                int day=ip.nextInt();
                int eve=ip.nextInt();
                int nyt=ip.nextInt();
                solution.colcamount(day, eve, nyt);
            } 
        }
        
    }
    
}
