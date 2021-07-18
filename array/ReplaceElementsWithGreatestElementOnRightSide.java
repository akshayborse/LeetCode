package array;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide obj = new ReplaceElementsWithGreatestElementOnRightSide();

        int[][] arr = {
            {17,18,5,4,6,1},            // expected - [18,6,6,6,1,-1]
            {400}                       // expected - [-1]
        };

        for(int[] ar:arr) {
            int[] ans = obj.replaceElements(ar);
            for(int an:ans) {
                System.out.print(an + "\t");
            }
            System.out.println();
        }
    }

    // int maxPos = 0;
    // int maxElement = 0;
    // public int[] replaceElements(int[] arr) {
    //     int i=0;
    //     for(; i<arr.length-1; i++) {
    //         if(i < maxPos) {
    //             arr[i] = maxElement;
    //         } else {
    //             maxElement = 0;
    //             arr[i] = getMaxRightElement(arr, i);
    //         }
    //     }
    //     arr[i] = -1;
    //     return arr;
    // }

    // private int getMaxRightElement(int[] arr, int i) {
    //     for(int j=i+1; j<arr.length; j++) {
    //         if(arr[j] > maxElement) {
    //             maxElement = arr[j];
    //             maxPos = j;
    //         }
    //     }
    //     return maxElement;
    // }

    public int[] replaceElements(int[] arr) {
        int maxElement = -1;
        for(int i=arr.length-1; i>=0; i--) {
            if(maxElement<arr[i]) {
                int temp = arr[i];
                arr[i] = maxElement;
                maxElement = temp;
            } else {
                arr[i] = maxElement;
            }
        }
        return arr;
    }
}
