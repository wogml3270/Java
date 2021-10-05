package ch05;

public class ArrayCopyShallowExample {
    public static void main(String[] args) {
//        byte, short, long, int, float, double, char, String
//        int arr3[] = {1, 2, 3}; // C언어 스타일
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; //얕은 복사 (shallow copy)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0] : " + arr2[0]);

        arr1[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0] : " + arr2[0]);

        System.out.println(arr1 == arr2); //true
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
    }
}
