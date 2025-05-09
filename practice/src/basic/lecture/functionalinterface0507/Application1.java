package basic.lecture.functionalinterface0507;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class Application1 {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("hello");

        runnable.run();

        /* Consumer<T>#accept(T t) : void : 객체 T를 받아 소비 */
        Consumer<String> consumer = (str) -> System.out.println(str + "이(가) 출력됨");
        consumer.accept("hello world");

        /* BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비 */
        BiConsumer<String, LocalTime> biConsumer = (str,time) -> System.out.println(str + "이(가) " + time + "에 출력됨");
        biConsumer.accept("hello world", LocalTime.now());

        /* IntConsumer#accept(int value) : void : int값을 받아서 소비한다.*/
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 정수의 제곱은 " + (num*num) + "입니다.");
        intConsumer.accept(15);

        /* LongConsumer#accept(long value) : void : long값을 받아서 소비한다.*/
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(12345);

        /* ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int값을 받아 소비한다. */
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (random, value) ->
                        System.out.println("0부터 " + value + " 전 까지의 난수 발생 " + random.nextInt(value));
        objIntConsumer.accept(new java.util.Random(), 10);

        /* ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long값을 받아 소비한다. */
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date +"의 " + days + "일 후의 날짜는" + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        /* ObjDoubleConsumer<T>#accept(T t) : void : 객체 T와 double값을 받아 소비한다.*/
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }
}