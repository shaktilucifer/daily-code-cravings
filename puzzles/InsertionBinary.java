
import java.io.*;

/**
 * Trying out binary search as a tool to insert elements into a sorted array
 * The function returns the index one higher than the point of insertion.
 * It returns the same index if the value is already present.
 */

class InsertionBinary {
    public int findInsertionPoint(int[] sortedArr, float value) {
        int low = 0;
        int high = sortedArr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (sortedArr[mid] == value) {
                return mid;
            }
            if (sortedArr[mid] > value) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) throws java.lang.Exception {
        InsertionBinary i = new InsertionBinary();
        int[] arr = {1,2,3,4,5,6,7,9};
        int index = i.findInsertionPoint(arr, 8);
        System.out.println(index);
        index = i.findInsertionPoint(arr,2.2f);
        System.out.println(index);
	index = i.findInsertionPoint(arr,-2.2f);
	System.out.println(index);

    }
}
