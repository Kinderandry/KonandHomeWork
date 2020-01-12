package HomeWork.Task_3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.abs;

public class Human {
    boolean sex;
    String firstName;
    String lastName;
    double height;
    double weight;

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Human(boolean sex, String firstName, String lastName, double height, double weight) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    private static boolean probability(int bound) {
        return ThreadLocalRandom.current().nextInt(100) < bound;
    }

    public static boolean talk(Human human1, Human human2) {
        boolean sex1 = human1.sex;
        boolean sex2 = human2.sex;
        boolean conversation = false;
        if (!(sex1 == sex2)) {
            conversation = true;
        } else if (sex1) {
            conversation = probability(50);
        }
        System.out.println("Can we talk? " + conversation);
        return conversation;
    }

    public static boolean society(Human human1, Human human2) {
        boolean sex1 = human1.sex;
        boolean sex2 = human2.sex;
        boolean society;
        if (sex1 == sex2) {
            society = probability(5);
        } else {
            society = probability(70);
        }
        System.out.println("Is my society acceptable? " + society);
        return society;
    }

    public static boolean spendTimeTogether(Human human1, Human human2) {
        double height1 = human1.height;
        double height2 = human2.height;
        // | (a — b) / [ (a + b) / 2 ] | * 100 %
        double difference = abs((height1 - height2) / ((height1 + height2) / 2)) * 100;
        boolean spendTime = false;
        if (difference <= 10) {
            spendTime = probability(95);
        } else if (difference > 10) {
            spendTime = probability(85);
        }
        System.out.println("Will we spend time together? " + spendTime);
        return spendTime;
    }

    public static Human bornHuman(Human human1, Human human2) {
        boolean sex = probability(50);
        String lastName;
        double height = 0;
        double weight = 0;
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
        }
        Human baby = new Human(sex, firstName, lastName, height, weight);
        System.out.println(baby.toString());
        return baby;
    }

    public static Human relationship(Human human1, Human human2) {
        if (talk(human1, human2) && society(human1, human2) && spendTimeTogether(human1, human2)) {
            if (human1.sex != human2.sex) {
                System.out.println("New Human is born");
                System.out.println("Name your baby:");
                if (!human1.sex) {
                    return human1.bornHuman(human1, human2);
                } else {
                    return human2.bornHuman(human1, human2);
                }
            } else {
                System.out.println("Oops");
                return null;
            }
        } else {
            System.out.println("We didn’t succeed. We are apart.");
            return null;
        }
    }
}