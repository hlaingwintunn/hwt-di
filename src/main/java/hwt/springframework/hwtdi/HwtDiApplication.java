package hwt.springframework.hwtdi;

import hwt.springframework.hwtdi.controllers.*;
import hwt.springframework.hwtdi.examplebean.FakeDataSource;
import hwt.springframework.hwtdi.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@SpringBootApplication
public class HwtDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HwtDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUsername());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());

//		System.out.println(controller.sayHello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

//		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
//		System.out.println(i18NController.sayHello());
//
//		MyController myController = (MyController) ctx.getBean("myController");
//		System.out.println("---------Primary---------");
//		System.out.println(myController.sayHello());
//
//		System.out.println("--------Property------------");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("-------Setter----------");
//		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("---------Constructor----------");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());
	}

}
