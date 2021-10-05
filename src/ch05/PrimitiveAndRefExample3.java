package ch05;

class Name {
    static void print() {
        System.out.println("egoing");
    }

    void print2() {
        System.out.println("chimsil");
    }
}

public class PrimitiveAndRefExample3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.val = 3;

        Box box2 = new Box();
        box2.val = 5;

        PrimitiveAndRefExample.ChangeVal(box1);
        PrimitiveAndRefExample.ChangeVal(box2);
//        System.out.println(box1.val);
//        System.out.println(box2.val);

        Name.print();

        Name name = new Name();
        name.print2();
    }


}
