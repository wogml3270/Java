package ch05;

public class MethodTest {
    public static void main(String[] args) {
//        printMyself("J Park", 26, 171.2f, 'O');
//        System.out.println();
//        printMyself("egoing", 30, 180.05f, 'A');

        int mon = (int)(Math.random() * 12) + 1;
        System.out.println("mon : " + mon);
        printSeason(mon);
    }

    public static void printMyself(String nm, int age, float height, char bloodType){
        System.out.printf("%s의 키는 %fcm, 나이는 %,d세, 혈액형은 %c형이다.",
                nm, height, age, bloodType);
    }
    public static void printSeason(int mon){
        if (mon < 1 || mon > 12) {
            System.out.println("알 수 없음");
        } else if(mon == 12 || mon < 3){
            System.out.println("겨울");
        } else if(mon < 6){
            System.out.println("봄");
        } else if(mon < 9){
            System.out.println("여름");
        } else {
            System.out.println("가을");
        }
    }
}
