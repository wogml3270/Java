package ch07;

public class AnimalTest {
    /*
    다형성 (여러가지 형태가 있는 성질)

    1. 부모타입은 자식객체 주소값 저장할 수 있다.
       (가리킬 수 있다.)
    2. 자식타입은 부모객체 주소값 저장할 수 없다.
       (가리킬 수 없다.) 바로 컴파일에러 발생.
    3. 메소드 호출은 타입이 알고 있는 것만 호출
       할 수 있고, 내용은 객체 기준이다.
     */
    public static void main(String[] args) {
        BigCat bigcat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Object obj = 1;

        Cat cat2 = new BigCat();
        cat2.crying();
    }
}
