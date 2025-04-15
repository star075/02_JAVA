package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("x 값 입력 : ");
            String str = sc.nextLine();

            if(str.equals("q")) {
                break;
            }
            System.out.println("입력값 = " + str);
        }
        // 스캐너 닫기
        sc.close();
        
    }
}
