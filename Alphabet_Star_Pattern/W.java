import java.util.Scanner;

public class W {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        
        scan.close();

        int i,j;

        for (i=0;i<x;i++)
        {
            for (j=0;j<x*4-1;j++)
            {
                if (i==j || i+j==x*2-2 || j==i+(x*2)-2 || i+j==x*4-4) {
                System.out.print("*");
                }

                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
