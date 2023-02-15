package org.example;

import java.util.Scanner;

//전수정
public class PassCheck {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");

        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력해주세요.(숫자): ");
        int age = scan.nextInt();
        System.out.print("입장시간을 입력해주세요.(숫자입력): ");
        int time = scan.nextInt();
        System.out.print("국가유공자 여부를 입력해주세요.(y/n): ");
        char nm = scan.next().charAt(0);
        System.out.print("복지카드 여부를 입력해주세요.(y/n): ");
        char card = scan.next().charAt(0);

        if(age < 3) {
            System.out.println("입장료 : 무료입장");
        } else if (age < 13 || time > 17) {
            System.out.println("입장료 : 4000원");
        } else if (nm == 'y' || card == 'y') {
            System.out.println("입장료 : 8000원");
        } else {
            System.out.println("입장료 : 10000원");
        }

        scan.close();
    }
}
