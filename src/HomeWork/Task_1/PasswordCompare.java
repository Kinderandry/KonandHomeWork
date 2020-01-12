package HomeWork.Task_1;

public class PasswordCompare {
    public static void main(String[] args) {
        String sample = "Password";
        if (sample.equals(args[0])) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is wrong");
        }
    }
}
