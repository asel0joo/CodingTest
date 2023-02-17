package org.example;

import java.util.Random;
import java.util.Scanner;

//전수정
public class IDCard {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");

        Scanner scan = new Scanner(System.in);
        System.out.print("출생년도를 입력해주세요.(yyyy)");
        int year = scan.nextInt();
        System.out.print("출생월을 입력해주세요.(mm)");
        String month = scan.next();
        System.out.print("출생일을 입력해주세요.(dd)");
        String day = scan.next();
        System.out.print("성별을 입력해주세요.(m/f)");
        String gender = scan.next();

        //주민번호 뒷자리 성별 구분
        int genderNum = 0;
        if (year < 2000){
            genderNum = gender.equals("m")? 1 : 2;
        } else {
            genderNum = gender.equals("m") ? 3 : 4;
        }

        //주민번호 뒷자리 난수 생성
        Random random = new Random();
        String randomNum = String.format("%06d", random.nextInt(1000000));      //random.nextInt() : int형 난수반환, 6자리 반환해야 하기 때문에 1000000으로 범위설정

        System.out.println(year + month + day + "-" + genderNum + randomNum);

        scan.close();
    }
}
