package ex10_10;

public class Item {
    private String Name;
    private int price;

    public Item(String name, int price) {}

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
