package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        FindAllNumbersDisappearedinanArray obj = new FindAllNumbersDisappearedinanArray();

        int[][] numArray = {
            {4,3,2,7,8,2,3,1},  // expected -> [5,6]
            {1,1}               // expected -> [2]
        };
        for(int[] nums:numArray) {
            List<Integer> ans = obj.findDisappearedNumbers(nums);
            for(int a:ans) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new LinkedList<>();
        for(int i=1; i<=nums.length; i++) {
            int temp1 = 0;
            int temp2 = nums[i-1];
            while(nums[i-1]!=i) {
                temp1 = nums[temp2-1];
                if(temp1==temp2) {
                    break;
                }
                nums[temp2-1] = temp2;
                temp2 = temp1;
            }
        }
        for(int i=1; i<=nums.length;i++) {
            if(nums[i-1]!=i) {
                ans.add(i);
            }
        }
        return ans;
    }
}
