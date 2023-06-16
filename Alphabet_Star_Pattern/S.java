import java.util.Scanner;

public class S {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();

    scan.close();

    int i,j;

    for (i=0;i<x;i++) {
        if (i==0) System.out.print("  ");
        else 
        System.out.print("* ");
    }

    System.out.println();

    for (i=0;i<x-1;i++) {
        for (j=0;j<i+1;j++) {
            if (j==0) System.out.print("* ");
            else System.out.print("  ");
        }
    
    System.out.println();
    }

    for (i=0;i<x;i++) System.out.print("* ");

    System.out.println();

    for (i=0;i<x-1;i++)
    {
        for (j=0;j<x;j++) {
            if (j==x-1) System.out.print("* ");
            else System.out.print("  "); 
        }
        System.out.println();
    }

    for (i=0;i<x;i++) {
        if (i==x-1) System.out.print("  ");
        else 
        System.out.print("* ");
    }

    }

}
