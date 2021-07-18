package array;

/**
 * Given an array nums of non-negative integers, return an array consisting of all the even elements of nums,
 * followed by all the odd elements of nums.
 */

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int[] nums = {3,1,2,4};
        int[] ans = obj.sortArrayByParity(nums);
        for(int an:ans) {
            System.out.print(an + "\t");
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}
