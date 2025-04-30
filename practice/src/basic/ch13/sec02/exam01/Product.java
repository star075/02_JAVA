package basic.ch13.sec02.exam01;

public class Product<K, M> {

    private K kind; // 제품 종류
    private M model; // 제품 모델

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "kind=" + kind +
                ", model=" + model +
                '}';
    }
}

// 💡 제네릭 타입 <T, M>:
// - T: 제품 종류의 타입 (예: Tv, Car 클래스 객체 등)
// - M: 제품 모델명 타입 (예: String 등 문자열)
//
// ✅ 장점:
// - Product<Tv, String>, Product<Car, String> 등 다양한 조합 가능
// - 형변환 없이 타입 안정성 있게 사용 가능