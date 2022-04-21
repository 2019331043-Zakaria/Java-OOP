import java.util.Scanner;
public class Input_line {
     public static void main(String [] args)
     {
         Scanner input = new Scanner(System.in);

         String s= input.nextLine(); // this will input a word not space
         System.out.println(s);

         String str= input.next(); // this will input a line/ paragraph
         System.out.println(str);

     }
}
