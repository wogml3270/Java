package ch05;

import java.util.Locale;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String s1 = new String ("Hello");
        System.out.println(s1);
        changeVal(s1);
        //String은 변수로 한번 지정되면 바꿀 수 없다.
        System.out.println(s1);
    }
    public static void changeVal(String str){
        str = new String ("안녕");
    }

}
