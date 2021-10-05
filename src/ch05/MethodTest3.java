package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        getRandom(0, 100); // 30~40 랜덤한 값을 리턴하는 메소드를 구현
        getABS(10);
        getABS(-10);
        PowerOn();
    }
    public static int getABS(int val){
        int absVal = val;
        System.out.println("absVal : " + absVal);
        return val < 0 ? -val : val;

    }
    public static int getRandom(int n1, int n2){
        int rVal = (int)(Math.random() * (n2 - n1 + 1)) + n1;
        System.out.println("결과값 : " + rVal);
        return 0;

    }
    public static void PowerOn(){
        System.out.println("On");
    }
}
