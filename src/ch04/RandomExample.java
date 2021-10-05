package ch04;

public class RandomExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 7);
        System.out.println("num : " + num);
        // 0 ~ 5

        // 2~7
        int num2 = (int)(Math.random() * 6) + 2;
        System.out.println("num3 : " + num2);

        int num3 = (int)(Math.random() * 54) + 55;
        System.out.println("num3 : " + num3);
    }
}
