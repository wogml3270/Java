package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32};

        // 점수가 짝수인 수의 점수 프린트
        // 점수가 홀수인 수의 합계점수(1) 프린트
        int oddSum = 0;
        for(int i=0; i<scores.length; i++){
           if(i % 2 == 0){
               System.out.println(scores[i]);
           } else{
               oddSum += scores[i];
           }
        }
        System.out.println("홀수 합계 : " + oddSum);

    }
}
