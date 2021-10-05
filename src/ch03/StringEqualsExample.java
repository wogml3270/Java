package ch03;

public class StringEqualsExample {
    public static void main(String[] args) {
        //문자열값 비교!, 절대 == 비교하시면 안 된다.!!!!!!!!!!

        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요");
        System.out.println(str1 == str2);

        String str3 = str2;
        System.out.println(str3 == str2);

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
