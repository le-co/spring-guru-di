package guru.springframework.didemo.controller;

import guru.springframework.didemo.controllers.ConstructorController;
import guru.springframework.didemo.service.MessageServiceImp;


import org.junit.Before;
import org.junit.Test;


public class ConstructorControllerTest {

    private ConstructorController constructorController;

    @Before
    public void setUp(){
        this.constructorController = new ConstructorController(new MessageServiceImp());
    }

    @Test
    public void checkMessage(){
        assert constructorController.sayHello().equals(MessageServiceImp.HELLO_GURUS);
    }
}
