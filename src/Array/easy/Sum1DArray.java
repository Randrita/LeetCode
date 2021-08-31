package Array.easy;
//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;
import java.util.Scanner;

public class Sum1DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        int[] ans=new int[n];
        int[] res=new int[n];

        //input
        for(int i=0;i<n;i++){
            ans[i]=input.nextInt();
        }

        res[0]=ans[0];

        for(int i=1;i<n;i++){
            res[i]=res[i-1]+ans[i];
        }

        System.out.println(Arrays.toString(res));
    }
    }




