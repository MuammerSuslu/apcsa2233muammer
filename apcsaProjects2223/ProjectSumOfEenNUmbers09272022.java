package apcsaProjects2223;

public class ProjectSumOfEenNUmbers09272022
{
    public static void main(String[] args)
    {
        int sum = 0 ;
        for (int i = 0; i<100 ; i++)
        {
            if (i%2==0)
            {
                sum = sum+1;
                System.out.println(sum);
            }
        }
       // System.out.println(sum);
    }
}