import java.util.*;
public class Pattern_Printing {
    public static void  main(String[] args)
    {
        System.out.println("Enter the number of row : ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        for(int i=1 ; i<n ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                System.out.print(" ");
            }

            for(int j=1 ; j<=i+i-1 ; j++)
            {
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }
}
/*

     *
    ***
   *****
  *******
 *********


 */