import java.util.Scanner;

public class Z {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        scan.close();

        int i,j;

        for (i=0;i<x*2-1;i++)
        {
            if (i==0 || i==x*2-2) {
            for (j=0;j<x*2-1;j++)
            {
                System.out.print("* ");   
            }
            }

            else {
                for (j=0;j<x*2-1;j++)
                {
                    if (i+j==x*2-2) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
    
}
