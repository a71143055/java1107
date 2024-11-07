package ex10_09;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안 고양이");
        cat.sleep(7);
        cat.cry("야옹야옹");
        cat.grooming();
        cat.eat("생선");
    }
}
