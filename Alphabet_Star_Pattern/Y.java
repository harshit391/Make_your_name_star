import java.util.Scanner;

public class Y {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        scan.close();

        int i,j;

        for (i=0;i<x;i++)
        {
            if (i<x/2+1){
            for (j=0;j<x;j++)
            {
                if (j==i || i+j==x-1) System.out.print("* ");
                else System.out.print("  ");
            }
            }

            else 
            {
                for (j=0;j<x;j++)
                {
                if (j==x/2) System.out.print("* ");
                else System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    
}
