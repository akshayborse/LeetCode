package array;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
    public static void main(String[] args) {
        DuplicateZeros obj = new DuplicateZeros();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        obj.duplicateZeros(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public void duplicateZeros(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                q.add(arr[i]);
            }
            if(!q.isEmpty()) {
                q.add(arr[i]);
                arr[i] = q.poll();
            }
        }
    }
}
