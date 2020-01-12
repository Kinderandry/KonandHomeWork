package HomeWork.Task_4;

public class Food extends BaseItem{
    private boolean gmo;

    public Food(String name, double price, boolean gmo) {
        super(name, price);
        this.gmo = gmo;
    }

    public boolean isGmo() {
        return gmo;
    }

    public void setGmo(boolean gmo) {
        this.gmo = gmo;
    }

    @Override
    public String toString() {
        return "Food{" +
                "gmo=" + gmo +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    }
