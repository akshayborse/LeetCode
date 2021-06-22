package array;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits obj = new FindNumbersWithEvenNumberOfDigits();

        int[] nums = {12,345,2,6,7896};
        System.out.println(obj.findNumbers(nums));
    }

    public int findNumbers(int[] nums) {
        int evenNums = 0;
        for(int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length() % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }
}
