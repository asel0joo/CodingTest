package org.example;

//전수정
public class Gugudan {

    public static void main(String[] args) {

        System.out.println("[구구단 출력]");
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf(i + " x " + j + " = " + String.format("%2d", i * j));
                System.out.print("    ");
            }
            System.out.println();
        }
    }

}
