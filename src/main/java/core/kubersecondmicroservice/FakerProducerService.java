package core.kubersecondmicroservice;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FakerProducerService implements ProducerService{
    private final Faker faker;

    public String produceFakeData() {
        String sentence = faker.lorem().sentence();
        System.out.println("Produced sentence: " + sentence);
        return sentence;
    }
}
