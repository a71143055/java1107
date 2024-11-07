package ex10_10;

public class Item {
    private String Name;
    private int price;

    public Item(String name, int price) {
        this.Name = name;
        this.price = price;
    }

    public Item() {
        this("칼", 6000);
        System.out.println("기본 생성자가 호출됨.");
    }

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
