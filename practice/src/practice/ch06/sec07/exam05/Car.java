package practice.ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
    }

    Car(String model) {
        this(model, "빨강", 100);
    }

    Car(String model, String color) {
        this(model, color, 100);
    }

    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "company='" + company + '\'' +
//                ", model='" + model + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }
}
