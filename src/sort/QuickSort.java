package sort;

public class QuickSort {

    public int Partition(int a[],int p,int r) {
        int x = a[r - 1];
        int i = p - 1;
        int temp;
        for (int j = p; j <= r - 1; j++) {
            if (a[j - 1] <= x) {
                i++;
                temp = a[j - 1];
                a[j - 1] = a[i - 1];
                a[i - 1] = temp;
            }
        }
        return 0;
    }

}