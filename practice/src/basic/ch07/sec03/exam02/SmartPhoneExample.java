package basic.ch07.sec03.exam02;

//// 나
//public class SmartPhoneExample {
//    public static void main(String[] args) {
//        Phone smartphone = new Smartphone("갤럭시", "은색");
//        System.out.println("smartphone.model = " + smartphone.model);
//        System.out.println("smartphone.color = " + smartphone.color);
//    }
//}

// 강사님
public class SmartPhoneExample {
    public static void main(String[] args) {
        /*
         * 상속
         * - 부모가 가지고 있는 재산(멤버)를 자식이 물려받음을 의미
         * - 단순히 물려받는 것보다, 자바에서는 확장의 개념을 의미
         * - 물려받은 것 + a를 할 수 있기 때문
         * */
        Smartphone myPhone = new Smartphone("갤럭시", "은색");

        System.out.println("myPhone.color = " + myPhone.color);
        System.out.println("myPhone.model = " + myPhone.model);

        myPhone.printModel();
    }
}

