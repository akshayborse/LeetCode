package array;

public class ValidMountainArray {
    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        int[][] arr = {
            {2,1},          // false
            {3,5,5},        // false
            {0,3,2,1},      // true
            {9,8,7,6,5,4},   // false
            {4,4,3,2,1}     // false
        };
        for(int[] ar:arr) {
            System.out.println(obj.validMountainArray(ar));
        }
    }

    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) {
            return false;
        }

        if(arr[0] >= arr[1])
            return false;
        
        boolean isIncreasing = true;
        for(int i=2; i<arr.length; i++) {
            if(isIncreasing) {
                if(arr[i] == arr[i-1]) {
                    return false;
                }
                if(arr[i] < arr[i-1]) {
                    isIncreasing = false;
                }
            } else {
                if(arr[i] >= arr[i-1]) {
                    return false;
                }
            }
        }

        return !isIncreasing;
    }
}
