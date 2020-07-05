package ObserverDesignPatternDemo;

import SharedObject.Person;

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
