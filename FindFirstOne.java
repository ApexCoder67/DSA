// Java implementation to find the index of first
// '1' in a sorted array of 0's and 1's
public class FindFirstOne {

    // function to find the index of first '1'
    // binary search technique is applied
    static int indexOfFirstOne(int arr[]) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    // Driver program to test above
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println(indexOfFirstOne(arr));
    }
}

