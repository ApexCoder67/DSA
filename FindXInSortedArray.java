// Java implementation to find an element x
// in a sorted array using binary search

/*
Given a sorted array of integers, find the index of a given element x.
If x is not present in the array, return -1.

Example:
Input: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, x = 5
Output: 4
Explanation: Element 5 is at index 4 in the array.

Input: arr[] = {1, 2, 3, 4, 5}, x = 7
Output: -1
Explanation: Element 7 is not present in the array.
*/

public class FindXInSortedArray {

    // function to find element x in sorted array
    // binary search technique is applied
    static int findElement(int arr[], int x) {
        int n = arr.length;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Driver program to test above
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 5;
        System.out.println("Element " + x + " found at index: " + findElement(arr, x));

        int x2 = 7;
        System.out.println("Element " + x2 + " found at index: " + findElement(arr, x2));
    }
}

