package ObserverDesignPatternDemo;

import SharedObject.Person;

public class CouponService {

    public void sendCoupon(Person person) {
        System.out.println("send coupon to new user: " + person.name);
    }
}
