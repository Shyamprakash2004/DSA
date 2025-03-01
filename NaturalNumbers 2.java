import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int sum = 0;
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        
        System.out.println(sum);
    }
}
