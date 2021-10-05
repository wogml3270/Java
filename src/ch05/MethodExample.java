package ch05;

public class MethodExample {

    // method는 항상 class 안에다가 만들어야한다(method안에 method만들기 불가)

             // 리턴타입(void)      파라미터(매개변수)(String[] args)
    public static void main(String[] args) {
                // 메소드명(void main(String[] args)
        // 메소드 구현부( {    } )

        sum(10, 20); // method 호출
        sum(50, 120);
        minus(50, 20);
        minus(100,98);
            //arguments
    }
// return타입은 굳이 return을 적을 필요 없다.
    public static void sum(int n1, int n2){
        System.out.println("sum : " + (n1 + n2));
    }
    public static void minus(int n1, int n2){
        System.out.println("minus : " + (n1 - n2));
    }
}
