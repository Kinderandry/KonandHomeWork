package HomeWork.Task_1;

import java.util.Scanner;

public class HelloUserScanner {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        if (userName.length() != 0){
            System.out.println("Hello, " + userName);
        } else {
            System.out.println("Hello, user");
        }
    }
}
