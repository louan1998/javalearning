package priv.wcy.algorithm.sort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {8,4,6,1,3,0};
        Sort sort = new Sort();
        sort.insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
