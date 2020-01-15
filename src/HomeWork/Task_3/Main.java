package HomeWork.Task_3;

public class Main {
    public static void main(String[] args) {
        Man kent = new Man(true, "Kent", "Brok", 1.80, 75.0);
        Woman tamara = new Woman(false, "Tamara", "Puliaeva", 1.85, 50.0);

        CompatibilityTest.test(kent, tamara);
    }
}
