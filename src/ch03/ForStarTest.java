package ch03;

public class ForStarTest {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2;
        System.out.println("star : " + star);

        for (int z = 0; z < star; z++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
