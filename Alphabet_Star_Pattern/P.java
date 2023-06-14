import java.util.Scanner;

public class P {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x;i++)
        {
            if (i==0 || i==x-1) {
                for (j=0;j<x-1;j++) 
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else 
            {
                for (j=0;j<x;j++) 
                {
                    if (j==0 || j==x-1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
                
            }
        }

        for (i=x;i<x*2-1;i++)
        {
            for (j=0;j<x;j++) 
            {
                if (j==0) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }




    }


}
