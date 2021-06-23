package array;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        obj.merge(nums1, m, nums2, n);
        for(int a:nums1) {
            System.out.println(a);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n) {
            if(nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m) {
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n) {
            ans[k] = nums2[j];
            j++;
            k++;
        }
        for(int l=0; l<nums1.length; l++) {
            nums1[l] = ans[l];
        }
    }
}
