class recursiveBinSearchArray
{

    public static int binarySearch(int[]arr , int i, int j, int sval)
    {
        if (i > j) {
            return -1;
        }
        int mid = (i + j) / 2;
        if (sval == arr[mid]) {
            return mid;
        }
        else if (sval < arr[mid]) {
            return binarySearch(arr, i, mid - 1, sval);
        }
        else {
            return binarySearch(arr, mid + 1, j, sval);
        }
    }

    public static void main(String[] args)
    {
        int[]arr = { 2, 5, 6, 8, 9, 10 };
        int sval = 10;

        int i = 0;
        int j = arr.length - 1;

        int index = binarySearch(arr, i, j, sval);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}