
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem4a {

    /**
     * @param args the command line arguments
     */
     static String binaryConvert (int n, int b)
    {
     
        if (n == 0|| n == 1)
        {
            return "" + n;
        }
        else if(n%b == 10)
        {
            n/=b;
            return binaryConvert(n, b)  + "A";
        }else if(n%b == 11)
        {
            n/=b;
            return binaryConvert(n, b) + "B";
        }
        else if(n%b == 12)
        {
            n/=b;
            return binaryConvert(n, b)  + "C";
        }
        else if(n%b == 13)
        {
            n/=b;
            return binaryConvert(n, b)  + "D";
        }
        else if(n%b == 14)
        {
            n/=b;
            return binaryConvert(n, b)  + "E";
        }
        else if(n%b == 15)
        {
            n/=b;
            return binaryConvert(n, b)  + "F";
        }
        else if(n%b == 16)
        {
            n/=b;
            return binaryConvert(n,b) + "G";
        }
        {
            return binaryConvert(n/b,b)+ n%b;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to be converted ");
        int n = input.nextInt();
        System.out.print("Enter a number to convert by ");
        int b = input.nextInt();
        System.out.println(binaryConvert(n,b));
    }
}
