package HomeWork.Task_3;

import java.util.Scanner;

class Woman extends Human {
    Woman(boolean sex, String firstName, String lastName, double height, double weight) {
        super(sex, firstName, lastName, height, weight);
    }

    static Human bornHuman(Human human1, Human human2) {
        boolean sex = probability(50);
        String lastName;
        double height;
        double weight;
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        if (human1.sex) {
            lastName = human1.lastName;
        } else {
            lastName = human2.lastName;
        }

        if (sex == human1.sex) {
            height = human1.height + 0.1 * (human2.height - human1.height);
            weight = human1.weight + 0.1 * (human2.weight - human1.weight);
        } else {
            height = human2.height + 0.1 * (human1.height - human2.height);
            weight = human2.weight + 0.1 * (human1.weight - human2.weight);
        }


        Human baby = new Human(sex, firstName, lastName, height, weight);
        System.out.println(baby.toString());
        return baby;
    }
}
