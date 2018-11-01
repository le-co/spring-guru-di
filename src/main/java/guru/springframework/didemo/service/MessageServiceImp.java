package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {

    public final static String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
