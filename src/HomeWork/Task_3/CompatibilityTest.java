package HomeWork.Task_3;

public interface CompatibilityTest {
    static Human test(Human human1, Human human2) {
        return human1.relationship(human2);
    }
}
