package HomeWork.Task_1;

import java.util.Arrays;

public class RevertArgs {
    public static void main(String[] args) {
        System.out.println("Entered values " + Arrays.toString(args));
        for (int i = 0; i < args.length/2; i++) {
            String tmp = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = tmp;
        }
        System.out.println("Reversed values " + Arrays.toString(args));
    }
}
