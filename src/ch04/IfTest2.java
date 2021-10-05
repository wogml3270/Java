package ch04;

public class IfTest2 {
    public static void main(String[] args) {

        int score = 95;

        char grade = 'D';
        char vew = ' ';

        if(score >= 90){
            grade = 'A';
            if(score >= 98){
                vew = '+';
            } else if(score <= 93){
                vew = '-';
            }
        } else if(score >= 80){
            grade = 'B';
            if(score >= 88){
                vew = '+';
            } else if(score <= 83){
                vew = '-';
            }
        } else if(score >= 70){
            grade = 'C';
            if(score >= 78){
                vew = '+';
            } else if(score <= 73){
                vew = '-';
            }
        }
        System.out.printf("%c%c", grade, vew);

    }
}
