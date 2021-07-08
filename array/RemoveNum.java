package array;

public class RemoveNum {

    public static void main(String[] args) {
        RemoveNum removeNum = new RemoveNum();
        int[] nums = {0,1,2,2,3,0,4,2};
        int k = removeNum.removeElement(nums, 2);
        System.out.println(k);

        for(int i=0; i<k;i++) {
            System.out.print(nums[i] + "\t");
        }
    }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    
}
