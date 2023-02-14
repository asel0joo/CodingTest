package org.example;

import java.util.Scanner;

//전수정
public class CashBack {
    public static void main(String[] args) {

        System.out.println("[캐시백 계산]");

        System.out.printf("결제 금액을 입력해주세요.(금액): ");
        Scanner scan = new Scanner(System.in);
        int won = scan.nextInt();
        
        CashBack cashBack = new CashBack();
        int cback = cashBack.cashBack(won);

        System.out.printf("결제금액은 %d원이고, 캐시백은 %d원 입니다.", won, cback);

        scan.close();
    }

    public int cashBack(int money) {
        double result = 0;
        result = money * 0.1;

        if(result >= 300) {
            result = 300;
        } else {
            result = (money/1000)*100;
        }

        return (int)result;
    }

}
