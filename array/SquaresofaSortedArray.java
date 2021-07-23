package array;

import java.util.Arrays;

class SquaresofaSortedArray {
    public static void main(String[] args) {
        SquaresofaSortedArray obj = new SquaresofaSortedArray();
        int[] nums = {-4,-1,0,3,10};
        int[] ans = obj.sortedSquares(nums);
        for(int a:ans) {
            System.out.println(a);
        }
    }

    // public int[] sortedSquares(int[] nums) {
    //     for(int i=0; i<nums.length; i++) {
    //         nums[i] = nums[i] * nums[i];
    //     }
    //     Arrays.sort(nums);
    //     return nums;
    // }

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[right+1];
        for(int i=nums.length-1; i>=0; i--) {
            if(Math.abs(nums[left])<Math.abs(nums[right])) {
                ans[i] = nums[right] * nums[right];
                right--;
            } else {
                ans[i] = nums[left] * nums[left];
                left++;
            }
        }
        return ans;
    }
}