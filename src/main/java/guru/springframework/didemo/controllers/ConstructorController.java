package guru.springframework.didemo.controllers;

import guru.springframework.didemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private MessageService messageService;

    @Autowired
    public ConstructorController(@Qualifier("constructorServiceImp") MessageService messageService) {
        this.messageService = messageService;
    }

    public String sayHello() {
        return this.messageService.sayHello();
    }
}
