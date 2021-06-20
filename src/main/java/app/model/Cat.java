package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    public Cat(String cat) {
        super(cat);
    }

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
