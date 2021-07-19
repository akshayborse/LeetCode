package array;

import java.util.Arrays;

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a
 * single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected
 * where expected[i] is the expected height of the ith student in line.
 * 
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 * 
 * Return the number of indices where heights[i] != expected[i].
 */

public class HeightChecker {
    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();

        int[][] heights = {
            {1,1,4,2,1,3},      // 3
            {5,1,2,3,4},        // 5
            {1,2,3,4,5}         // 0
        };

        // expected 
        //     {1,1,1,2,3,4},
        //     {1,2,3,4,5},
        //     {1,2,3,4,5

        for(int[] height:heights) {
            System.out.println(obj.heightChecker(height));
        }
    }

    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        for(int i=0; i<heights.length; i++) {
            if(heights[i] != expected[i]) {
                ans++;
            }
        }
        return ans;
    }
}
