package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
//    public Dog(String dog) {
//        super(dog);
//    }
//
//    public Dog() {
//        super();
//    }

    @Override
    public String toString() {
        return "Im a Dog";
    }

}
