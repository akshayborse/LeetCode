package array;

import java.util.HashSet;

/**
 * Given integer array nums, return the third maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        ThirdMaximumNumber obj = new ThirdMaximumNumber();
        int[][] numsArray = {
            {1,-2147483648,2},  // -2147483648
            {1,2,2,5,3,5},      // 2
            {1,2,-2147483648},  // -2147483648
            {3,2,1},            // 1
            {1,2},              // 2
            {2,2,3,1}           // 1
        };

        for(int[] nums:numsArray) {
            System.out.println(obj.thirdMax(nums));
        }
    }

    // public int thirdMax(int[] nums) {
    //     int first=Integer.MIN_VALUE;
    //     int second=Integer.MIN_VALUE;
    //     int third=Integer.MIN_VALUE;

    //     HashSet<Integer> hs = new HashSet<>();

    //     for(int num:nums) {
    //         hs.add(num);
    //     }

    //     for(int h:hs) {
    //         if(h>first) {
    //             third = second;
    //             second = first;
    //             first = h;
    //         } else if(h>second) {
    //             third = second;
    //             second = h;
    //         } else if(h>third) {
    //             third = h;
    //         }
    //     }
    //     if(hs.size()<3) {
    //         return first;
    //     }
    //     return third;
    // }

    public int thirdMax(int[] nums) {
        Integer first=null;
        Integer second=null;
        Integer third=null;

        for(Integer num:nums) {

            if(num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }

            if(first==null || num>first) {
                third = second;
                second = first;
                first = num;
            } else if(second==null || num>second) {
                third = second;
                second = num;
            } else if(third==null || num>third) {
                third = num;
            }
        }
        if(third==null) {
            return first;
        }
        return third;
    }
}
