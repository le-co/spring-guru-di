package guru.springframework.didemo.controllers;

import guru.springframework.didemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class PropertyController {

    @Autowired
    public MessageService messageService;

    public String sayHello() {
        return this.messageService.sayHello();
    }
}
