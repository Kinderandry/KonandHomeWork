package HomeWork.Task_4;

public class Stock extends BaseItem {
    String material;

    public Stock(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "material='" + material + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
