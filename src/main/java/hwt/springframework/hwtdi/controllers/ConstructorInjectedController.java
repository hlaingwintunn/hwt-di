package hwt.springframework.hwtdi.controllers;

import hwt.springframework.hwtdi.services.GreetingService;

public class ConstructorInjectedController {

    public final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
