package narif.poc.springboot.messaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {


    @Value("#{messageSource.getMessage('hello.message', new Object[]{'Najeeb'}, locale)}")
    private String message;

    @GetMapping
    public String getMessage(){
        return message;
    }
}
