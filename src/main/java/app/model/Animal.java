package app.model;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Animal {

    private String dog;
    private String cat;


    public Animal(@Qualifier("dog") String dog,
                  @Qualifier("cat") String cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Animal(String cat) {
    }

    public Animal() {
    }

//    public String getDog() {
//        return dog;
//    }
//
//    public String getCat() {
//        return cat;
//    }


}
