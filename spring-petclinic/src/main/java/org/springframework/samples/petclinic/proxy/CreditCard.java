package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment {
    // 이녀석이 일종의 프록시가 됨
    // 일종의 크레딧카드의 한도가 없으면, Cash 로 Fallback 함
    Payment cash = new Cash();

    @Override
    public void pay(int amount) {
        if (amount > 100) {
            System.out.println(amount + " 신용 카드");
        } else {
            cash.pay(amount);
        }
    }
}
