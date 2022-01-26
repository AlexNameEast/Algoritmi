package Lesson03.search;

public class BinarySearch {
    public static int search(Integer[] arr, int num2Find) {
        return search(arr, num2Find, 0, arr.length - 1);
    }

    public static int search(Integer[] arr, int num2Find, int start, int end){
        int  base, i = 0;

        while (end >= start) {
            i++;
            base = (start + end) / 2;
            System.out.printf("Base = " + base);

            if (arr[base] == num2Find) {
                System.out.println("++ кол итерраций - " + i);
                return base;
            } else if (base < num2Find) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        return -1;
    }
}
