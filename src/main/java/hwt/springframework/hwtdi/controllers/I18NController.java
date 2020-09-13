//package hwt.springframework.hwtdi.controllers;
//
//import hwt.springframework.hwtdi.services.GreetingService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class I18NController {
//
//    public final GreetingService greetingService;
//
//    public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public String sayHello() {
//        return greetingService.sayGreeting();
//    }
//}
