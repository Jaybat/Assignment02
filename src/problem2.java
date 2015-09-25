
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem2 {

    /**
     * @param args the command line arguments
     */
    static int triangle (int n)
    {
        if(n == 0)
        {
            return n;
        }else
        {
            return n + triangle(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();
        System.out.println(triangle(n));
    }
}
