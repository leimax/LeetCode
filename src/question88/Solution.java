package question88;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};   //  {1, 2, 3,0,0,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);

        for (int i:nums1){
            System.out.println("[main]："+i);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m + n];//定义一个新的数组，长度为两个原数组长度之和
        int i = 0, j = 0, count = 0;//定义三个指针，分别指向三个数组的第一个元素
        //当指针位置小于数组长度时，比较两个数组的元素的大小，小的放入新数组
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArray[count++] = nums1[i++];
            } else {
                newArray[count++] = nums2[j++];
            }
        }

        if (i >= m) {//当第一个数组遍历完成，直接将第二个数组元素放入新数组
            while (j < n) {
                newArray[count++] = nums2[j++];
            }
        }
        if (j <= n) {//当第一个数组遍历完成，直接将第二个数组元素放入新数组
            while (i < m) {
                newArray[count++] = nums1[i++];
            }
        }
        for (int k=0;k<newArray.length;k++){//将新数组的元素依次赋值给nums1
            //nums1[k]=newArray[k];
            System.out.println("[newArray]："+newArray[k]);
        }

    }
}