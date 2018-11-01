package guru.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class GreetingServiceImp implements MessageService {

    @Override
    public String sayHello() {
        return "Primary hello";
    }
}
