import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
        if(A.compareToIgnoreCase(B)>B.compareToIgnoreCase(A))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        String a = A.substring(0,1);
        String b = B.substring(0, 1);
        b = b.toUpperCase();
        a = a.toUpperCase();
        System.out.println(a + A.substring(1) + " " + b + B.substring(1));
    }
}
