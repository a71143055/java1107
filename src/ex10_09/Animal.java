package ex10_09;

abstract public class Animal {
    private String name;

    public abstract void eat(String food);
    public abstract void cry(String sound);

    public void sleep(int hours) {
        System.out.println(hours + "시간 동안 잔다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
