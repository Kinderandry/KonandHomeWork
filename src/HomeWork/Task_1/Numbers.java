package HomeWork.Task_1;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        // Data converting
        int[] num = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        // Even and odd numbers
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int value : num) {
            if (value % 2 == 0) {
                even.add(value);
            } else {
                odds.add(value);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odds numbers: " + odds);

        // Max and min number
        int max = 0;
        int min = 0;
        for (int value : num) {
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);

        // Numbers which divided on 3 OR 9
        ArrayList<Integer> div3or9 = new ArrayList<>();
        for (int value : num) {
            if (value % 3 == 0) {
                div3or9.add(value);
            }
        }
        System.out.println("Numbers which divided on 3 OR 9 " + div3or9);

        // Numbers which divided on 5 AND 7
        ArrayList<Integer> div5and7 = new ArrayList<>();
        for (int value : num) {
            if ((value % 5 == 0) && (value % 7 == 0)) {
                div5and7.add(value);
            }
        }
        System.out.println("Numbers which divided on 5 AND 7 " + div5and7);

        // Lucky numbers
        for (String value : args) {
            String[] tmp = value.split("");
            int one = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);
            int two = Integer.parseInt(tmp[2]) + Integer.parseInt(tmp[3]);
            if (one == two) {
                System.out.println(value);
            }

        }
    }
}
