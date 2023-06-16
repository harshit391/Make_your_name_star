import java.util.Scanner;

public class H {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x*2-1;i++)
        {
            if (i==x-1) {
                for (j=0;j<x;j++) 
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


    }


}
