import java.util.Scanner;
class Array_Binary_Search1 {
    public int BinarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if ( arr[mid]==key) {
                return mid;
            } else if ( arr[mid]<key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int var = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = var;
                }
            }
        }
    }

}
public class Array_Binary_Search{
        public static void displayArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            Array_Binary_Search1 obj=new Array_Binary_Search1();
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Array size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println(" Enter array Elements");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print(" Array Elements Before Sorting: ");
        displayArray(arr);

        System.out.println("---------------Bubble Sort------------");
        obj.BubbleSort(arr);
        System.out.println("Array Elements After Sorting:");
        displayArray(arr);
        System.out.println("--------------------------------------");
        System.out.println("---------------Binary Search------------");
        System.out.print("Enter Any Element To Find Out:  ");
        int binarySearchNum = sc.nextInt();
        long beforeBinarySearch = System.nanoTime();
        int binarySearchResult = obj.BinarySearch(arr, binarySearchNum);
        long afterBinarySearch = System.nanoTime();
        System.out.print("Array Elements Before Searching: ");
        displayArray(arr);
        System.out.println("Time before Binary Search: " + beforeBinarySearch + " Nano Second");
        System.out.println("Time After Binary Search: " + afterBinarySearch + " Nano Second");
        System.out.println("Index of Found Number: " + binarySearchResult);
        System.out.println(" Founded number is "+binarySearchNum);
        System.out.println("Time difference Between Before and After Binary Search : " + (afterBinarySearch - beforeBinarySearch));
        System.out.println("--------------------------------------");
    }

}
