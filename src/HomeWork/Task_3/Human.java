package HomeWork.Task_3;

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.abs;

public class Human {
    boolean sex;
    private String firstName;
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

    Human(boolean sex, String firstName, String lastName, double height, double weight) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    static boolean probability(int bound) {
        return ThreadLocalRandom.current().nextInt(100) < bound;
    }

    private static boolean talk(Human human1, Human human2) {
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

    private static boolean society(Human human1, Human human2) {
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

    private static boolean spendTimeTogether(Human human1, Human human2) {
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

    Human relationship(Human couple) {
        if (talk(this, couple) && society(this, couple) && spendTimeTogether(this, couple)) {
            if (this.sex != couple.sex) {
                System.out.println("New Human is born");
                System.out.println("Name your baby:");
                if (!this.sex) {
                    return Woman.bornHuman(this, couple);
                } else {
                    return Woman.bornHuman(this, couple);
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