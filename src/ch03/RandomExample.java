package ch03;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6);
        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6) + 2;

        // 55~108
        int num3 = (int)(Math.random() * 54) + 55;
    }
}
