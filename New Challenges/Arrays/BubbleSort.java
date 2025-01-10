package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr []){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
}
