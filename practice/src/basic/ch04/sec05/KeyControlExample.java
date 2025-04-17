package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
//    public static void main(String[] args) {
//        int speed = 0;
//
//        System.out.println("-----------------------------");
//        System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//        System.out.println("-----------------------------");
//
//        System.out.print("선택: ");
//        Scanner sc = new Scanner(System.in);
//        int mode = sc.nextInt();
//
//        while(mode == 1 || mode == 2){
//
//            if (mode == 1) {
//                speed++;
//            } else {
//                speed--;
//            }
//            System.out.println("현재 속도 = " + speed);
//
//            System.out.println("-----------------------------");
//            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//            System.out.println("-----------------------------");
//
//            System.out.print("선택: ");
//            mode = sc.nextInt();
//        }
//        System.out.println("프로그램 종료!");
//    }

    public static void main(String[] args) {
        int speed = 0;
        Scanner sc = new Scanner(System.in);
        int mode;

        do {
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");

            System.out.print("선택: ");
            mode = sc.nextInt();

            if (mode == 1) {
                speed++;
            } else if (mode == 2) {
                speed--;
            }

            if (mode == 1 || mode == 2) {
                System.out.println("현재 속도 = " + speed);
            }

        } while (mode == 1 || mode == 2);

        System.out.println("프로그램 종료!");
    }

}
