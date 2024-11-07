package ex10_10;

public class Item {
    private String name;
    private int price;
    private int power;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
        this("칼", 6000);
        System.out.println("기본 생성자가 호출됨.");
    }

    public Item(String name, int price, int power) {
        this(name , price);
        this.power = power;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
