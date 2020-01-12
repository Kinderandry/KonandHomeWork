package HomeWork.Task_4;

abstract public class BaseItem {
    protected String name;
    protected double price;

    public BaseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
