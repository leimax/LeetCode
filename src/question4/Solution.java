package question4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = mergeTwoSortedArray(nums1, nums2);
        int n = newArr.length;
        if (n % 2 == 0) {
        // even
        return (double) (newArr[n / 2] + newArr[n / 2 - 1]) / 2;
        } else { // odd
         return (double) newArr[n / 2];
        }
    }
    private int[] mergeTwoSortedArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m + n];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[idx++] = nums1[i++]; }
            else { res[idx++] = nums2[j++]; }
        }
        while (i < m) {
            res[idx++] = nums1[i++];
        }
        while (j < n) {
            res[idx++] = nums2[j++];
        }
        return res;
    }
}