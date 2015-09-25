
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem4 {

    /**
     * @param args the command line arguments
     */
    static String binaryConvert (int n, int b)
    {
        if (b > 10 && b < 17)
        {
       // if(n < 16)
        {
        //return binaryConvert(n%b, b);
        }
        if(n == 10)
        {
            return "A";
        }else if(n == 11)
        {
            return "B";
        }
        else if(n == 12)
        {
            return "C";
        }
        else if(n == 13)
        {
            return "D";
        }
        else if(n == 14)
        {
            return "E";
        }
        else if(n == 15)
        {
            return "F";
        }
        else if(n == 16)
        {
            return "G";
        }
        else
        {
            return binaryConvert(n/b,b) + (n%b);
        }
        }else
        {
            return binaryConvert(n/b,b) + (n%b);
        }
    
    
    }
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to be converted ");
        int n = input.nextInt();
        System.out.print("Enter a base number ");
        int b = input.nextInt();
        System.out.println(binaryConvert(n, b));  
    }
}
