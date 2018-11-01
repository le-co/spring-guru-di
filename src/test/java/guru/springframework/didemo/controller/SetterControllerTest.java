package guru.springframework.didemo.controller;

import guru.springframework.didemo.controllers.SetterController;
import guru.springframework.didemo.service.MessageServiceImp;
import org.junit.Before;
import org.junit.Test;

public class SetterControllerTest {
    private SetterController setterController;

    @Before
    public void setUp(){
        this.setterController = new SetterController();
        this.setterController.setMessageService(new MessageServiceImp());
    }

    @Test
    public void checkMessage(){
        assert setterController.sayHello().equals(MessageServiceImp.HELLO_GURUS);
    }
}
