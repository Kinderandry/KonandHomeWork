package HomeWork.Task_2;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Input numbers " + Arrays.toString(args));

        // Data converting
        int[] data = stringArrayToIntArray(args);

        // 1. Shortest and longest number
        int[] len = getLength(args);
/*        System.out.println("Length of numbers " + Arrays.toString(len));
        int max = 0;
        String index_max = "";
        String index_min = "";
        for (int i = 0; i < len.length; i++) {
            if (len[i] > max) {
                max = len[i];
                index_max = args[i];
            }
        }
        int min = max;
        for (int i = 0; i < len.length; i++) {
            if (len[i] < min) {
                min = len[i];
                index_min = args[i];
            }
        }
        System.out.println("Max length " + max + ", number " + index_max);
        System.out.println("Min length " + min + ", number " + index_min);*/

        // 2. Sorted lengths
/*        sortByLength(data, len);
        System.out.println("Sorted lengths " + Arrays.toString(len));
        System.out.println("Sorted array " + Arrays.toString(data));*/

        // 3. Numbers with length bigger than average
/*        int sum = 0;
        for (int i : len) {
            sum += i;
        }
        int avg = sum / len.length;
        for (int i = 0; i < data.length; i++) {
            if (len[i] > avg) {
                System.out.println(data[i] + " is bigger than average and its length is " + len[i]);
            }
        }*/

        // 4. Numbers with unique digits
        for (int i = 0; i < args.length; i++) {
            String[] split = args[i].split("");
            int gl_count = 0;

            if (split.length > 1) {
                for (int j = 0; j < split.length - 1; j++) {
                    int counter = 0;
                    if (split[j].equals(split[j+1])) {
                        counter++;
                        if (counter > gl_count) {
                            gl_count = counter;
                        }
                    }
                }
            } else {
                System.out.println(Arrays.toString(split));
            }
        }

    }

    static int[] getLength(String[] args) {
        int[] len = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            len[i] = args[i].length();
        }
        return len;
    }

    static int[] sortByLength(int[] data, int[] len) {
        for (int barrier = len.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (len[index] > len[index + 1]) {
                    int tmp = len[index];
                    len[index] = len[index + 1];
                    len[index + 1] = tmp;

                    tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
        return data;
    }

    static int[] stringArrayToIntArray(String[] args) {
        int[] data = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
        }
        return data;
    }
}