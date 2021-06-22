package array;

class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == 1) {
                int maxOnesLocal = 0;
                while(i < nums.length && nums[i] != 0) {
                    maxOnesLocal++;
                    i++;
                }
                if(maxOnesLocal > maxOnes) {
                    maxOnes = maxOnesLocal;
                }
            }
            i++;
        }
        return maxOnes;
    }
}