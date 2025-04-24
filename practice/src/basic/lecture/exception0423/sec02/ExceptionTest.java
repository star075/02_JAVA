package basic.lecture.exception0423.sec02;

import basic.lecture.exception0423.sec02.exception.MoneyNegativeException;
import basic.lecture.exception0423.sec02.exception.NotEnoughMoneyException;
import basic.lecture.exception0423.sec02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, NotEnoughMoneyException, MoneyNegativeException {

        // 가격이 음수일 때
        if (price < 0) {
            throw new PriceNegativeException("가격은 음수일 수 없습니다.");
        }
        // 가지고 있는 돈이 음수일 때
        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈을 음수일 수 없습니다.");
        }
        // 가지고 있는 돈이 부족할 때
        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            throw new NotEnoughMoneyException("가지고 있는 돈보다 상품 가격이 비쌉니다!!");
        }
    }
}