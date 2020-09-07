package hwt.springframework.hwtdi;

import hwt.springframework.hwtdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HwtDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HwtDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

	}

}
