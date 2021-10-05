package ch03;

public class IfTest {
    public static void main(String[] args) {
        int score = 89;

        if(score >= 90) {
            if(score >= 98) {
                System.out.println("A+");
            } else if(score <= 93) {
                System.out.println("A-");
            } else {
                System.out.println("A");
            }
        } else if (score >= 80) {
            if(score >= 88) {
                System.out.println("B+");
            } else if(score <= 83) {
                System.out.println("B-");
            } else {
                System.out.println("B");
            }
        } else if (score >= 70) {
            if(score >= 78) {
                System.out.println("C+");
            } else if(score <= 73) {
                System.out.println("C-");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("D");
        }



        //점수가 90점이상이면 A
        //점수가 80점이상이면 B
        //점수가 70점이상이면 C
        //70점 미만이면 D

        //C등급 이상이면
        // ?7점 이상이면 +
        // ?3점 이하이면 -

        // 예) 98점이면 A+
        // 예) 85점이면 B
        // 예) 73점이면 C-



    }
}
