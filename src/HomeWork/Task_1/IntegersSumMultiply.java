package HomeWork.Task_1;

public class IntegersSumMultiply {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        for (String arg : args) {
            int tmp = Integer.parseInt(arg);
            sum += tmp;
            mul *= tmp;
        }
        System.out.println("Sum of args: " + sum);
        System.out.println("Multiplication of args: " + mul);
    }
}
