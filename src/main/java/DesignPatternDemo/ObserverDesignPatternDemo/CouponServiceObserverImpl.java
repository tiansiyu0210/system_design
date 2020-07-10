package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public class CouponServiceObserverImpl implements NewUserRegisterObserver {

    private CouponService couponService;

    public CouponServiceObserverImpl(CouponService couponService) {
        this.couponService = couponService;
    }

    @Override
    public void handleNewUserRegistration(Person person) {
        couponService.sendCoupon(person);
    }
}
