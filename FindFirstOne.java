/**
 * Java implementation to find the index of first '1' in a sorted array of 0's and 1's
 *
 * Problem Description:
 * Given a sorted array consisting of only 0's and 1's, find the index of the first '1'.
 * If 1's are not present in the array, return -1.
 *
 * Approach: Binary Search
 * - Since the array is sorted, all 0's come before 1's
 * - We use binary search to efficiently find the first occurrence of 1
 * - Time Complexity: O(log n) - logarithmic time due to binary search
 * - Space Complexity: O(1) - constant space, only using a few variables
 *
 * Algorithm:
 * 1. Initialize lo = 0, hi = n-1, ans = -1
 * 2. While lo <= hi:
 *    a. Calculate mid = (lo + hi) / 2
 *    b. If arr[mid] == 1:
 *       - Store mid in ans (as this could be the first 1)
 *       - Search in the left half by setting hi = mid - 1
 *    c. If arr[mid] == 0:
 *       - The first 1 must be in the right half
 *       - Set lo = mid + 1
 * 3. Return ans (either the index of first 1 or -1 if not found)
 *
 * Examples:
 * - Input: [0, 0, 0, 0, 0, 0, 1, 1, 1, 1] → Output: 6
 * - Input: [0, 0, 0, 0] → Output: -1
 * - Input: [1, 1, 1, 1] → Output: 0
 * - Input: [0, 1] → Output: 1
 */

public class FindFirstOne {

    /**
     * Finds the index of the first '1' in a sorted array of 0's and 1's
     * using binary search technique.
     *
     * @param arr - The sorted array containing only 0's and 1's
     * @return The index of the first '1', or -1 if no '1' is found
     */
    static int indexOfFirstOne(int arr[]) {
        int n = arr.length;
        int lo = 0;           // Starting index (left pointer)
        int hi = n - 1;       // Ending index (right pointer)
        int ans = -1;         // Variable to store the result

        // Binary search loop
        while (lo <= hi) {
            // Calculate the middle index
            int mid = (lo + hi) / 2;

            // If we found a 1
            if (arr[mid] == 1) {
                ans = mid;              // Store this index as potential answer
                hi = mid - 1;           // Search in the left half for an earlier 1
            }
            // If we found a 0, the first 1 must be on the right
            else {
                lo = mid + 1;           // Move right
            }
        }

        return ans;
    }

    /**
     * Driver program to test the indexOfFirstOne function
     */
    public static void main(String[] args) {
        // Test case 1: Array with 0's followed by 1's
        int arr1[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println("Test Case 1:");
        System.out.println("Array: " + arrayToString(arr1));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr1));
        System.out.println();

        // Test case 2: Array with only 0's
        int arr2[] = { 0, 0, 0, 0 };
        System.out.println("Test Case 2:");
        System.out.println("Array: " + arrayToString(arr2));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr2));
        System.out.println();

        // Test case 3: Array with only 1's
        int arr3[] = { 1, 1, 1, 1 };
        System.out.println("Test Case 3:");
        System.out.println("Array: " + arrayToString(arr3));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr3));
        System.out.println();

        // Test case 4: Single element - 0
        int arr4[] = { 0 };
        System.out.println("Test Case 4:");
        System.out.println("Array: " + arrayToString(arr4));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr4));
        System.out.println();

        // Test case 5: Single element - 1
        int arr5[] = { 1 };
        System.out.println("Test Case 5:");
        System.out.println("Array: " + arrayToString(arr5));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr5));
        System.out.println();

        // Test case 6: First 1 at the beginning
        int arr6[] = { 1, 1, 1 };
        System.out.println("Test Case 6:");
        System.out.println("Array: " + arrayToString(arr6));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr6));
        System.out.println();

        // Test case 7: Mixed case with 1 in the middle
        int arr7[] = { 0, 0, 1, 1, 1, 1, 1 };
        System.out.println("Test Case 7:");
        System.out.println("Array: " + arrayToString(arr7));
        System.out.println("Index of first 1: " + indexOfFirstOne(arr7));
    }

    /**
     * Helper method to convert array to string for easy printing
     *
     * @param arr - The array to convert
     * @return String representation of the array
     */
    static String arrayToString(int arr[]) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

