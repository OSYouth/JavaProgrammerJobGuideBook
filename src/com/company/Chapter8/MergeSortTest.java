package com.company.Chapter8;

public class MergeSortTest {
    public static void Merge(int[] array, int p, int q, int r){
        int i, j, k, n1, n2;
        n1 = q - p + 1;
        n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = p; i< n1; i++, k++){
            L[i] = array[k];
        }
        for (i = 0, k = q+1; i < n2; i++, k++){
            R[i] = array[k];
        }
        for( k=p, i=0, j =0; i<n1 && j<n2; k++){
            if(L[i]>R[j]){
                array[k] = L[i];
                i++;
            }else {
                array[k] = R[j];
                j++;
            }
        }
        if(i<n1){
            for (j=i;j<n1;j++,k++){
                array[k] = L[j];
            }
        }
        if(j<n2){
            for (i=j;i<n2;i++,k++){
                array[k] = R[i];
            }
        }
    }

    public static void MergeSort(int[] array, int p, int r){
        if(p<r){
            int q = (p+r)/2;
            MergeSort(array,p,q);
            MergeSort(array,q+1,r);
            Merge(array,p,q,r);
        }
    }

    public static void main(String[] args){
        int i=0;
        int a[] = {5,4,9,8,7,6,0,1,3,2};
        int len = a.length;
        MergeSort(a,0,len-1);
        for(i=0; i <len;i++){
            System.out.print(a[i] + " ");
        }
    }
}
