import javax.swing.*;
import java.util.*;

public class solution{
    public static void main(String[] args) {
        System.out.println(numberOfPaths(2, 8));
    }
    static long[][] dp;
    static long numberOfPaths(int m, int n) {
        dp = new long[m+1][n+1];
        return solve(m,n);
    }
    public static long solve(int m,int n){
        if(m==1 || n==1)return 1; // if there is a single column or row then only a single way
        if(dp[m][n]!=0)return dp[m][n];
        long value =  numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
        dp[m][n] = value;
        return value;
    }
}
