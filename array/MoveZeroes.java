package array;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();

        int[][] arr = {
            {0,1,0,3,12},
            {0}
        };

        for(int[] ar:arr) {
            int[] nums = ar;
            obj.moveZeroes(nums);
            for(int num:nums) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
