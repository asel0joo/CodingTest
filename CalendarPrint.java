package org.example;

import java.util.Calendar;
import java.util.Scanner;

//전수정
public class CalendarPrint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.printf("달력의 년도를 입력해주세요.(yyyy):");
        int year = scan.nextInt();
        System.out.printf("달력의 월을 입력해주세요.(mm):");
        int month = scan.nextInt();

        System.out.println();


        // 달력 출력하기
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);     //month는 0~11의 값을 가지기 때문에 -1을 해줘야 함, 그래야 우리가 생각하는 1~12 값으로 표기됨 

        System.out.println("[" + year + "년" + month + "월]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        // 해당 달의 마지막 일자
        int lastDay = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        // 해당 달의 시작 요일
        int startDay = calendar.get(java.util.Calendar.DAY_OF_WEEK);

        int currentDay = 1;

        for (int i = 0; i <= 42; i++) {
            if (i < startDay) {
                System.out.print("\t");
            } else {
                System.out.printf("%02d\t", currentDay);
                currentDay++;
            }

            if (i % 7 == 0) {
                System.out.println();
            }

            if (currentDay > lastDay) {
                break;
            }
        }

    }
}
