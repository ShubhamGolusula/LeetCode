package arrays;

import java.util.stream.IntStream;

public class MergeSortedArray {
    public void merge(int[] a, int m, int[] b, int n) {
        if(m == 0 && n > 0){ IntStream.range(0,n).forEach((e)->{a[e] = b[e];});return;}
        if(n == 0) return;
        int i = m-1, j = n-1, k = m+n-1;
        while (i >= 0 && j >= 0){
            if(a[i] < b[j]){
                a[k--] = b[j--];
            } else {
                a[k--] = a[i--];
            }
        }
        if(j >= 0 ){
            while(j >= 0){
                a[k--] = b[j--];
            }
        }
    }
}
