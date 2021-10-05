package ch06;

public class PrivateClass {
    private int val;
    int defaultVal;

    public PrivateClass(){

    }

    private void print(){
        System.out.println("chimsil");
    }
}
// private : 같은 클래스 o, 같은 패키지 x, 다른 패키지 x
// public : 같은 클래스 o, 같은 패키지 o, 다른 패키지 o
// default : 같은 클래스 o, 같은 패키지 o, 다른 패키지 x
// protected : 같은 클래스 o, 같은 패키지 o, 다른 패키지는 상속만 접근가능


