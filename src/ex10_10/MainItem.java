package ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item item = new Item("마법지팡이", 5000);
        System.out.println("아이템명 : " + item.getName());
        System.out.println("아이템가격 : " + item.getPrice());

        Item item1 = new Item();
        System.out.println("아이템명 : " + item1.getName());
        System.out.println("아이템가격 : " + item1.getPrice());
    }
}
