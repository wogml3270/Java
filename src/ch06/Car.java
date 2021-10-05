package ch06;
/*
    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 메소드 (생성자)
 */
public class Car {
    String nm;
    String brand;

    // 생성자 (메소드랑 다른 점)
    // 1. 이름이 클래스명과 같다. (대문자로 시작)
    // 2. 리턴 타입이 없어야한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 기본 생성자

    // 오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //          파라미터만 다르다면 다르게 만들 수 있다.
    //          타입만 중요, 타입의 종류, 갯수, 순서, 리턴타입은 상관없음
    public Car(){}
        Car(int aaa, String bb){

        }


    public Car(String brand, String nm){
        this.brand = brand;
        this.nm = nm;
    }


    void drive(String str){
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }
    int drive(){
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
        return 0;
    }


    void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
