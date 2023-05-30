package day1;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        int a[] = {8,5,6,1,3,4,2};
        Dog a[] = {new Dog(3,4),new Dog(1,2),new Dog(2,2)};
        Sort sort = new Sort();
        sort.dubbleSort(a,new DogHeightComparetor());
        System.out.println(Arrays.toString(a));
    }
}
