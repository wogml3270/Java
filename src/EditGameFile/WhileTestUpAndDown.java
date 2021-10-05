package EditGameFile;

import java.util.Scanner;

public class WhileTestUpAndDown {
    public static void main(String[] args) {
        System.out.println("Up & Down Game!");
        Scanner scan = new Scanner(System.in);
        int low = 0, high = 99;
        int score = (int)(Math.random() * 100) + 1;

        while(true){
            int input = 0;
            System.out.print("숫자 입력 (0~100) : ");
            input = scan.nextInt();
            if(input > high || input < low){
                System.out.println("0~100까지의 숫자만 입력해주세요.");
            } else if(input < score){
                System.out.println("Up");
                continue;
            } else if(input > score){
                System.out.println("Down");
                continue;
            } else{
                System.out.print("정답입니다.");

            }
            System.out.print("다시하시겠습니까 (y/n)");
            if(scan.next().equals("n")) {
                break;
            } else{
                continue;
            }
        }
    }
}