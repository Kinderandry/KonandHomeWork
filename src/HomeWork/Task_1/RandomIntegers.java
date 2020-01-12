package HomeWork.Task_1;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        final Random random = new Random();
        int number = Integer.parseInt(args[0]);
        int[] result = new int[5];
        for (int i = 0; i < number; i++) {
            result[i] = random.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < number; i++) {
            System.out.println(result[i] + "");
        }
    }
}
