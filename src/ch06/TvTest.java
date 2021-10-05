package ch06;

public class TvTest {
    public static void main(String[] args){
        Tv tv = new Tv();
        tv.setBrand("Samsung");
        tv.setInch(50);
        System.out.println("tv brand : " + tv.getBrand());
        System.out.printf("tv inch : %dInch\n", tv.getInch());
//        tv.brand = "Samsung"; // 이렇게 direct로 변수를 사용하면 안된다.

        Tv tv2 = new Tv();
        tv2.setBrand("LG");
        tv2.setInch(48);
        System.out.println("tv2 brand : " + tv2.getBrand());
        System.out.printf("tv2 inch : %dInch\n", tv2.getInch());
//        tv2.brand = "LG";

        String s1 = "my name is chimsil\nmy name is java";
        String replaceString = s1.replace("is", "was");
        System.out.println(replaceString);
    }
}
