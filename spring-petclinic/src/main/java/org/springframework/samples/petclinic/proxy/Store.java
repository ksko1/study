package org.springframework.samples.petclinic.proxy;

public class Store {
    Payment payment;

    //generate : (win : alt+enter)
    public Store(Payment payment) {
        this.payment = payment;
    }

    // test 코드 작성 단축키 (Navigate -> Test : shift + ctrl + T)
    public void buySomething(int amount) {
        payment.pay(amount);
    }
}
