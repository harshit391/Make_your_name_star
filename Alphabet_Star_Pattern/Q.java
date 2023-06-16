import java.util.Scanner;

public class Q {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x*2-2;i++)
        {
            if (i==0) {
                for (j=0;j<x-1;j++) 
                {
                    if (j==x-1 || j==0)
                    System.out.print("  ");

                    else System.out.print("* ");
                }
                System.out.println();
            }

            else if (i>(x-x/2+1) && i<(x+2)){
                for (j=0;j<x;j++) 
                {
                    if (j==0 || j==x-1 || j==(i-x/2))
                    System.out.print("* ");

                    else System.out.print("  ");
                }
                System.out.println();
            }

            else if(i==x*2-3) {
                for (j=0;j<x+1;j++) 
                {
                    if (j==x-1 || j==0)
                    System.out.print("  ");

                    else if (j==x) System.out.print("* ");

                    else System.out.print("* ");
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