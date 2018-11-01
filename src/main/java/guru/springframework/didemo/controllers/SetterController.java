package guru.springframework.didemo.controllers;

import guru.springframework.didemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    private MessageService messageService;

    @Autowired
    public void setMessageService(@Qualifier("messageServiceImp") MessageService messageService) {
        this.messageService = messageService;
    }

    public String sayHello() {
        return this.messageService.sayHello();
    }
}
