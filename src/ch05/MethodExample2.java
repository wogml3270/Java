package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input o, output o (비void형일때 항상 return이 있어야한다)
        int result = sum(0, 10, 10.1);
        System.out.println("sum : " + result);
    }
    public static int sum(int n1, int n2, double n3 ){
        return (int) (n1 + n2 * n3);
    }
}
