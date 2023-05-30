package priv.wcy.algorithm.sort;

public class Sort {
    public void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int minpos = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[minpos]) {
                    minpos = j;
                }
            }
            if(i != minpos){
                int t =  arr[i];
                arr[i] = arr[minpos];
                arr[minpos] = t;
            }
        }
    }

    public void insertionSort(int[] arr){
        for (int i=1; i<arr.length; ++i){
            int value = arr[i];
            int position=i;
            while (position>0 && arr[position-1]>value){
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = value;
        }
    }
}
