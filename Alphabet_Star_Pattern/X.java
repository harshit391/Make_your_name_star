import java.util.Scanner;

public class X {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        
        scan.close();

        int i,j;

        for (i=0;i<x;i++)
        {
            for (j=0;j<x;j++)
            {
                if (i==j || i+j==x-1) {
                System.out.print("* ");
                }

                else System.out.print("  ");
            }

            System.out.println();
        }
    }
}
