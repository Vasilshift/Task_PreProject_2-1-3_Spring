package app.model;

import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Animal {

    private String dog;
    private String cat;

    public Animal(String dog, String cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Animal(String cat) {
    }

    public Animal() {

    }

    public String getDog() {
        return dog;
    }

    public String getCat() {
        return cat;
    }

}
