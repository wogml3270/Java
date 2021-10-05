package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열(Array)

        /*
            같은 타입의 값을 여러개 저장할 때 좋음
            for문과 함께 사용하면 최고의 시너지효과
         */
        int[] APT = {83, 90, 87, 91, 105, 160, 171}; // int[] : int형 배열
        APT[0] = 11;

        for(int i=0; i<APT.length; i++){
            System.out.println(APT[i]);
        }
    }
}
