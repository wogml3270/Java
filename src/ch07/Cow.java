package ch07;

public class Cow extends Animal {
    @Override
    public void crying() {
        System.out.println("소가 음머~~");
    }

    @Override
    public void eat() {
        System.out.println("소가 조용히 먹는다.");
    }
}
