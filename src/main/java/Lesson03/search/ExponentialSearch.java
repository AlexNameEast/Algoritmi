package Lesson03.search;

import java.util.Objects;

public class ExponentialSearch {

    public int search(Integer[] arr, Integer num2Find) {

        if (Objects.equals(arr[0], num2Find)) {
            return 0;
        }
        if (Objects.equals(arr[arr.length - 1], num2Find)) {
            return arr.length - 1;
        }

        int base = 1;

        while (base < arr.length && arr[base] <= num2Find) {
            if (Objects.equals(arr[base], num2Find)) {
                return base;
            }
            base *= 2;
        }


        return BinarySearch.search(arr, num2Find, base / 2 + 1, Math.min(base - 1, arr.length - 1));

    }
}
