package hwt.springframework.hwtdi;

import hwt.springframework.hwtdi.controllers.ConstructorInjectedController;
import hwt.springframework.hwtdi.controllers.MyController;
import hwt.springframework.hwtdi.controllers.PropertyInjectedController;
import hwt.springframework.hwtdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@SpringBootApplication
public class HwtDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HwtDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---------Primary---------");
		System.out.println(myController.sayHello());

		System.out.println("--------Property------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------Constructor----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
