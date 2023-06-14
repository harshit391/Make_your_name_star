import java.util.*;

public class N {

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x*2-1;i++)
        {
            for (j=0;j<x*2-1;j++)
            {
                if (j==0 || j==x*2-2 || i==j) System.out.print("* ");

                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
