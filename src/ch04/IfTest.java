package ch04;

public class IfTest {
    public static void main(String[] args){

        // 점수가 90점이상이면 A등급
        // 점수가 80점이상이면 B등급
        // 점수가 70점이상이면 C등급
        // 70점 미만이면 D등급

        // C등급 이상이면
        // ?8점 이상이면 +
        // ?3점 이하이면 -

        //예) 98점이면 A+, 85점이면 B, 73점이면 C-

        int score = 83;

        if(score >= 90){
            if(score >= 98){
                System.out.println("A+ Class");
            } else if(score <= 93){
                System.out.println("A- Class");
            }
        } else if(score >= 80){
            if(score >= 88){
                System.out.println("B+ Class");
            } else if(score <= 83){
                System.out.println("B- Class");
            }
        } else if(score >= 70){
            if(score >= 78){
                System.out.println("C+ Class");
            }else if(score <= 73) {
                System.out.println("C- Class");
            }
        } else{
            System.out.println("D class");
        }

    }
}
