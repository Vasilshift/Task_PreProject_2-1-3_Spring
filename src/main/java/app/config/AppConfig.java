package app.config;

import app.model.Cat;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

//    @Bean
//    public Cat createCat() {
//        return new Cat();
//    }
//
//    @Bean
//    public Dog createDog() {
//        return new Dog();
//    }

}
