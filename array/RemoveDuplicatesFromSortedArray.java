package array;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = obj.removeDuplicates(nums);
        System.out.println(k);

        for(int i=0; i<k;i++) {
            System.out.print(nums[i] + "\t");
        }
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 1;
        int val = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != val) {
                val = nums[i];
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    
}
