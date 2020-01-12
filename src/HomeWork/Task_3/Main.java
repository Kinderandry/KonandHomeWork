package HomeWork.Task_3;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(true, "Kent", "Brok", 1.80, 75.0);
        Human human2 = new Human(false, "Tamara", "Puliaeva", 1.75, 50.0);

        Human human3 = Human.relationship(human1, human2);
    }
}
