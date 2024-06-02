package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    // Function to implement Normal Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function to get user input and test the Normal Bubble Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Bubble Sort!");
        System.out.println("Press Enter Key to continue...");
        scanner.nextLine();
        System.out.println("Enter the number of elements you want :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements one by one :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("This is Unsorted array:");
        printArray(arr);
        
        bubbleSort(arr);
        System.out.println();
        System.out.println("This is Sorted array:");
        printArray(arr);
        System.out.println();
        System.out.println("End..");

        scanner.close();
    }
}