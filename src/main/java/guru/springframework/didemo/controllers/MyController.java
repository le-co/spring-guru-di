package guru.springframework.didemo.controllers;

import guru.springframework.didemo.service.MessageService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private MessageService service;

    public MyController(MessageService service) {
        this.service = service;
    }

    public String sayHello(){
        return this.service.sayHello();
    }
}
