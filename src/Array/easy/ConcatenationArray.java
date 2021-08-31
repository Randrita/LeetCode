package Array;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/concatenation-of-array/

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int n=nums.length*2;

        //crating a new array
        int[] ans=new int[n];

        for(int i=0;i<nums.length;i++){

            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }

        System.out.println(Arrays.toString(ans));

    }
}
