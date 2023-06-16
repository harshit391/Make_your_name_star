import java.util.Scanner;

public class J {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x*2;i++)
        {
            if (i==0) {
                for (j=0;j<x*2-1;j++) 
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else if (i==x*2-1)
            {
                for (j=0;j<(x*2-1)/2;j++)
                {
                    if (j!=0)
                    System.out.print("* ");

                    else System.out.print("  ");
                }
            }
            
            else if (i>(x*2-1)/2)
            {
                for (j=0;j<x*2-2;j++)
                {
                    if (j==0 || j==x-1) System.out.print("* ");

                    else System.out.print("  ");
                }
                System.out.println();
            }

            else 
            {
                for (j=0;j<x;j++) 
                {
                    if (j==(x*2-1)/2) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
                
            }


        }


    }


}
