package array;

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist obj = new CheckIfNAndItsDoubleExist();
        // int[] arr = {10,2,5,3};
        // int[] arr = {3,1,7,11};
        // int[] arr = {0,0};
        // int[] arr = {-3,0,3,11};
        int[] arr = {7,1,14,11};
        System.out.println(obj.checkIfExist(arr));
    }

    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();

        for(int val:arr) {
            if(hs.contains(val*2) || (val%2==0 && hs.contains(val/2))) {
                return true;
            } else {
                hs.add(val);
            }
        }


        return false;
    }
}
