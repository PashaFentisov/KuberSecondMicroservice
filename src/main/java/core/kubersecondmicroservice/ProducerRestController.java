package core.kubersecondmicroservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/producer")
public class ProducerRestController {
    private final ProducerService producerService;

    @GetMapping
    public String produceData(){
        return producerService.produceFakeData();
    }
}
