
import java.util.Scanner;
public class asiignament2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // reversearr(arr);
        // print(arr);
        // System.out.println(" maximum value of the array "+minmaxarr(arr));
        // sort(arr);
        // print(arr);
        // movenegative(arr);
        //  print(arr);
        int k= sc.nextInt();
        rotation(arr,k,n);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void reversearr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //    public static int minmaxarr(int arr[]) {
//        int max = Integer.MIN_VALUE;
//        int min =Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for(int j =0;j<arr.length;j++){
//            if(arr[j]<min){
//                min =arr[j];
//            }
//        }
//        System.out.println(" mimimum value of the array "+min);
//        return max;
//    }
//    public static void sort(int[] arr){
//        int low=0,mid=0,high =arr.length-1;
//        while(mid<=high){
//            if(arr[mid]==0){
//                int temp = arr[low];
//                arr[low]= arr[mid];
//                arr[mid]=temp;
//                low++;
//                mid++;
//            }
//        else if(arr[mid]==1){
//            mid++;
//            }
//        else{
//                int temp = arr[mid];
//                arr[mid]= arr[high];
//                arr[high]=temp;
//                high--;
//
//            }
//
//        }
//    }
//    public static void movenegative(int arr[]){
//        int j=0,temp=0;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]<0){
//                if(i!=j){
//                    temp =arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//                j++;
//            }
//        }
//    }
    public static void rotation(int arr[], int n, int k) {
        k = k % n;
        reversearr(arr,0,n- k- 1);
        reversearr(arr,n-k,n-1);
        reversearr(arr,0,n);


    }

    private static void reversearr(int[] arr, int i, int j) {
        while(i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
}





