package thuchanh;

public class BinarySearch {
    static int[] array = {1,3,4,4,6,7,7,9,13,15,16,17,17,20,50};
    static int binarySearch(int[] array,int key) {
        int start = 0;
        int end = array.length-1;
        while (end >= start) {
            int mid = (start + end)/2;
            if (key < array[mid]) {
                end = mid -1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearch(array, 11));
        System.out.println(binarySearch(array, 7));
        System.out.println(binarySearch(array, 13));
    }
}
