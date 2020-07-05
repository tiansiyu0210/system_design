package ObserverDesignPatternDemo;

import SharedObject.Person;

public class FreeGiftServiceObserverImpl implements NewUserRegisterObserver {

    FreeGiftService freeGiftService;

    public FreeGiftServiceObserverImpl(FreeGiftService freeGiftService) {
        this.freeGiftService = freeGiftService;
    }

    @Override
    public void handleNewUserRegistration(Person person) {
        freeGiftService.sendFreeGift(person);
    }
}
