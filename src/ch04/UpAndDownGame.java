package ch04;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("Up & Down Game!!");
        Scanner scan = new Scanner(System.in);
        //1~100
        int target = (int)(Math.random() * 1000) + 1;
        int val = 0, cnt = 0;
        int low = 0, high = 1000;

        while(true) {
            cnt++;
            System.out.print("숫자를 입력해 주세요 (0~1000) : ");
            val = scan.nextInt();
            if(val > high || val < low) {
                System.out.println("error!! 0~1000 사이 값을 입력해주세요.");
                continue;
            }
            if(val == target) {
                break;
            } else if(val > target) {
                System.out.println("Down!");
            } else {
                System.out.println("Up!");
            }
        }
        System.out.printf("정답! 총 %d번 시도하였습니다.", cnt);
        }

    }

