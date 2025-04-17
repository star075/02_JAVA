package basic.ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.print(x + " ");
        }
    }
}
