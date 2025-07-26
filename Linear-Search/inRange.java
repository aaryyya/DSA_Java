public class inRange {
    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 14, 13, 0, 3 };
        System.out.println(inRangeSearch(arr, 12, 0, 5));
    }

    static int inRangeSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}
