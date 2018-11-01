package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);


        System.out.println(ctx.getBean(MyController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorController.class).sayHello());
        System.out.println(ctx.getBean(SetterController.class).sayHello());

    }
}
