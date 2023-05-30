package day1;

public class Sort<T> {
    /*comparable实现方法*/
//    public static void dubbleSort(Comparable[] arr){
//        for (int i=0;i<arr.length-1;i++){
//            int minpos = i;
//            for (int j=i+1;j< arr.length;j++){
//                minpos = arr[j].comparaTo(arr[minpos])==-1?j:minpos;
//            }
//            swap(arr,i,minpos);
//        }
//    }
//    static void swap(Comparable[] arr,int i,int j){
//        Comparable temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }

    //comparator实现方法
    public void dubbleSort(T[] arr, Comparetor<T> comparetor){
        for (int i=0;i<arr.length-1;i++){
            int minpos = i;
            for (int j=i+1;j< arr.length;j++){
                minpos = comparetor.compara(arr[j],arr[minpos]) == -1 ? j : minpos;
            }
            swap(arr,i,minpos);
        }
    }
    void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
