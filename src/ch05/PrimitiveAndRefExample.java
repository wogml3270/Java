package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;

        Box box = new Box();
        box.val = 10;

        Box box2 = box;
        box.val = 50;

        box2 = new Box();


        System.out.println("val : " + val);
        val = ChangeVal(val);
        System.out.println("val : " + val);
        System.out.println("-----------");
        System.out.println("box.val : " + box.val);
        ChangeVal(box);
        System.out.println("box.val : " + box.val);
        System.out.println("box2.val : " + box2.val);
    }
    public static int ChangeVal(int pVal){
        return pVal * 2;
    }
    public static void ChangeVal(Box pBox){
        pBox.val = 30;
    }
}

class Box {
    int val;
    int val2;
    int val3;
    String str1;
}