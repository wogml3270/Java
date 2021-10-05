package ch04;

public class StringEqualsExample {
    public static void main(String[] args){
        // 문자열값 비교, 절대 == 비교하면 안된다.

        String str1 = new String ("Hello");
        String str2 = new String ("Hello");


        System.out.println(str1 == str2); // false

        String str3 = str2;
        System.out.println(str2 == str3); // true

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
