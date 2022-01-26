package Lesson03;

public class Home03 {


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16};

        System.out.println(searchIncorrectNum(array));

    }
    public static int searchIncorrectNum(Integer[] arr) {

        try {

            int end = arr.length - 1,
                    start = 0,
                    base,
                    i = 0;

            while (end >= start) {
                i++;
                base = (start + end) / 2;
                //System.out.printf("Base = " + base);

                if ((arr[base] == base + 1 && arr[base + 1] == base + 3)) {
                    return base + 2;
                } else if ((arr[base] == base + 2 && arr[base - 1] == base)) {
                    return base + 1;

                } else if (arr[base] - base == 1) {
                    start = base + 1;
                } else {
                    end = base - 1;
                }
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }

        return 0;
    }
}
