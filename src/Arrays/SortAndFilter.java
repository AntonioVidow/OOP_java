package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndFilter {
    public static int[] sortAndFilterArray(int key, int[] arr){
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < key) count++;
        }

        int[] copy = Arrays.copyOfRange(arr, 0, count);
        return copy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array elements with space in between : ");
        String[] input = scanner.nextLine().strip().split(" ");
        int[] array = Arrays.stream(input).mapToInt(Integer :: parseInt).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Input key which deletes all array elements bigger than it : ");
        int key = scanner.nextInt();

        int[] result = sortAndFilterArray(key, array);
        System.out.println("Final array : " + Arrays.toString(result));
    }

}
