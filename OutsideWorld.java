import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int wh_num = in.nextInt();
        char letter = in.next().charAt(0);
        double fra_part = in.nextDouble();
        String word = in.next();
        // Displaying the output
        System.out.println(wh_num);
        System.out.println(letter);
        System.out.println(fra_part);
        System.out.println(word);
    }
}
