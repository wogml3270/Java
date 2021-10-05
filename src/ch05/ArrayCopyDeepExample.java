package ch05;

public class ArrayCopyDeepExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};

        int[] arr2 = new int[arr1.length];
        System.out.println(arr1.hashCode() + ", " + arr2.hashCode());
        // 깊은 복사 (deep copy) 시도
        // arr2 = arr1; 이것은 얕은복사


        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println(arr1 == arr2); // false
    }
}
