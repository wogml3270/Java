package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "Samsung";
        System.out.println("Computer.brand : " + Computer.brand);
//        System.out.println("Computer.cpu : " + Computer.cpu); x

        Computer c1 = new Computer();
        c1.cpu = 10;
        System.out.println("c1.brand : " + c1.brand);
        System.out.println("c1.cpu : " + c1.cpu);

        Computer c2 = new Computer();
        c2.brand = "Apple";
        c2.cpu = 20;
        System.out.println("c2.brand : " + c2.brand);
        System.out.println("c2.cpu : " + c2.cpu);
        System.out.println("----------");
    }
}
