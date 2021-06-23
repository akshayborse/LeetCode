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

    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}