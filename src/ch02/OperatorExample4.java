package ch02;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 = 10;
        n1++;
        ++n1;
        System.out.println(n1);
        n1--;

        System.out.println(n1);
        System.out.println("-----");

        int n2 = 40;
        System.out.println(++n2);
        System.out.println(n2);

        System.out.println("-----");
        int n3 = 50;
        n3 = n3 + 3;
        n3 = n3 + 3;
        System.out.println("n3 : " + n3);

        System.out.println("-----");
        int n4 = 50;
        n4 += 3;
        n4 += 3;
        System.out.println("n4 : " + n4);
    }
}
