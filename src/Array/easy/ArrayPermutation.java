package Array;
//https://leetcode.com/problems/build-array-from-permutation/

    class Solution {
        public int[] buildArray(int[] nums) {
            int[] ans= new int[nums.length];
            for(int i:nums){
                ans[i]=nums[nums[i]];
            }

            return ans;

        }
    }

