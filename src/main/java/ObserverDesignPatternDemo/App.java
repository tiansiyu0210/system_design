package ObserverDesignPatternDemo;

import SharedObject.Person;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Person newUser = new Person("tian");
        UserService userService = new UserService();
        String status = userService.registerNewUser(newUser);
        if ("SUCCESS".equalsIgnoreCase(status)) {
            List<NewUserRegisterObserver> observers = new ArrayList<>();
            observers.add(new FreeGiftServiceObserverImpl(new FreeGiftService()));
            observers.add(new FreeShippingServiceObserverImpl(new FreeShippingService()));
            observers.add(new CouponServiceObserverImpl(new CouponService()));

            for (NewUserRegisterObserver observer : observers) {
                observer.handleNewUserRegistration(newUser);
            }
        }

    }
}
