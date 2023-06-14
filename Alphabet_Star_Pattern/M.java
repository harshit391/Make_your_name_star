import java.util.*;

public class M {

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x;i++)
        {
            for (j=0;j<x*2-1;j++)
            {
                if (j==0 || j==x*2-2) System.out.print("* ");

                else if (i==j || i+j==x*2-2) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
        }

        for (i=0;i<x/2;i++)
        {
            for (j=0;j<x*2-1;j++)
            {
                if (j==0 || j==x*2-2) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
