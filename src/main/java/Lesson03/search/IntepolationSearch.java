package Lesson03.search;

public class IntepolationSearch {
    public static int search(Integer[] arr, int num2Find){
        int  start=0, end= arr.length, base, i = 0;

        while (end >= start && num2Find >= arr[start] && num2Find <=arr[end] ) {
            if (arr[end].equals(arr[start])){
                break;
            }
            i++;
            base = (int) (start +
                    (end-start) / (arr[end] - arr[start])
                     * (num2Find - arr[start]));

            System.out.println("Base = " + base);

            if (arr[base] == num2Find) {
                System.out.println("++ кол итерраций - " + i);
                return base;
            } else if (base < num2Find) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }

        if(arr[start].equals(num2Find)){
            return 1;
        }
        return -1;
    }
}
