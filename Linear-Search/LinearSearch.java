import java.net.Socket;

public class LinearSearch {
    // public static void main(String[] args) {
    // int arr[] = new int[]{1,2,3,4,5,6,7};
    // int element=2;
    // if(LinearSearch(arr, 2)==-1){
    // System.out.println(element+"The Value Does Not Exist");
    // }else{
    // System.out.println("Element at Index "+LinearSearch(arr,2)+" is "+element);
    // }
    // }

    // static int LinearSearch(int []arr, int target){
    // if(arr.length==0){
    // return -1;
    // }
    // for(int i=0;i<arr.length;i++){
    // int element=arr[i];
    // if(element==target){
    // return i;
    // }
    // }

    // return -1;
    // }
    public static void main(String[] args) {
        int arr[] = { 14, 12, 1, 7, 9, 8, 3 };
        int eleToFind = 75;
        boolean found = false;
        if (arr.length == 0) {
            System.out.println("Array is Empty");
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == eleToFind) {
                System.out.println(index);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not Found");
        }

    }
}
