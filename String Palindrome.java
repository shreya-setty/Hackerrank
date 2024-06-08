import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch;
        String A1 = new String();
        for(int i = (A.length()-1);i>=0; i--)
        {
            A1 = A1 + A.charAt(i);
        }
        if (A.equals(A1))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
}
}
