/* Bubble Sort
 * Bubble Sort is one of the sorting algorithms that works by repeatedly swapping the adjacent elements of the array if they are not in sorted order.
 * You are given an unsorted array consisting of N non-negative integers. Your task is to sort the array in non-decreasing order using the Bubble Sort algorithm.
 * Sample Input 1:
 *  1
 *  5
 *  6 2 8 4 10
 *  Sample Output 1:
 *  2 4 6 8 10 
 *  Ekta Agrawal
 */
import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort (int[] arr, int n) {   
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase<t; testCase++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr, n);

            for (int i=0; i<n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
