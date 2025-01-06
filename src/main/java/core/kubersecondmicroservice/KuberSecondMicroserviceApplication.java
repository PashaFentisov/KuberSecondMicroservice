package core.kubersecondmicroservice;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@SpringBootApplication
public class KuberSecondMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuberSecondMicroserviceApplication.class, args);
    }

    @Bean
    public Faker faker(){
        return new Faker(Locale.ENGLISH);
    }
}
