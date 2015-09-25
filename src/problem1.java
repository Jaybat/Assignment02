
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem1 {

    /**
     * @param args the command line arguments
     */
     static int sum (int n)
    {
        if(n >= 0 && n <=9)
        {
            return n;
        }else
        {
            return n%10 + sum(n/10);
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a positive number ");
    int n = input.nextInt();
    System.out.println(sum(n));
    
    }
}
