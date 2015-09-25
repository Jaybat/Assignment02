
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem3 {

    /**
     * @param args the command line arguments
     */
    static String binaryConvert (int n)
    {
        if(n == 0|| n == 1)
        {
            return "" + n;
        }else
        {
            return binaryConvert(n/2) + (n%2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to be converted to binary");
        int n = input.nextInt();
        System.out.println(binaryConvert(n));
    }
}
