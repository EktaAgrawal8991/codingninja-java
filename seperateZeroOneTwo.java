/* Sort 0,1,2
 * You have been given an integer array/list(ARR) of size 'N'. It only contains 0s, 1s and 2s. Write a solution to sort this array/list.
 * Ekta AGrawal
 */

import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            }else {
                twoCount++;
            }
        }

        for (int i =0; i<zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i=zeroCount; i<zeroCount+oneCount; i++) {
            arr[i] = 1;
        }

        for (int i=zeroCount+oneCount; i<zeroCount+oneCount+twoCount; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arrays = new int[n][];

        for (int i=0; i<n; i++) {
            int size = sc.nextInt();

            arrays[i] = new int[size];

            for (int j=0; j<size; j++) {
                arrays[i][j] = sc.nextInt();
            }

            sort012(arrays[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
