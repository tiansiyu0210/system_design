package DesignPatternDemo.ObserverDesignPatternDemo;

import DesignPatternDemo.SharedObject.Person;

public class FreeShippingServiceObserverImpl implements NewUserRegisterObserver {
    FreeShippingService freeShippingService;

    public FreeShippingServiceObserverImpl(FreeShippingService freeShippingService) {
        this.freeShippingService = freeShippingService;
    }

    @Override
    public void handleNewUserRegistration(Person person) {
        freeShippingService.freeShipping(person);
    }
}
