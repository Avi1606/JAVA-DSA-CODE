import java.util.Arrays;

public class Cyclic_Sort {

}

public static void main(String[] args) {
    int []arr= {5 ,3,2 ,4,1};
    CyclicSort(arr);
    System.out.println(Arrays.toString(arr));
}

//static void CyclicSort(int [] arr){
//    int i=0;
//    while(i<arr.length){
//        int correctindex = arr[i]-1;
//        if(arr[i] != arr[correctindex]){
//            swap(arr , i , correctindex);
//        }else{
//            i++;
//        }
//    }
//}

static void CyclicSort(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        int correctindex = arr[i] -1;
        if(arr[i] != arr[correctindex]){
            swap(arr , i , correctindex);
//        }else{
//            continue;
        }
    }
}
static void swap(int [] arr, int first , int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
