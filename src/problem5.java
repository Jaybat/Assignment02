
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class problem5 {

    /**
     * @param args the command line arguments
     */
    public boolean isPalindrome(String s, int length)
    {
        if(s.length()==1 || s.length()==0)
        {
            return true;
        }
        else 
        {
            if (s.charAt(0) == s.charAt(length-1))
            return  s.substring(s, length-2);
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a word to determine if it is a palindrome");
    String s = input.nextLine();   
    int length = s.length();

    }
}
