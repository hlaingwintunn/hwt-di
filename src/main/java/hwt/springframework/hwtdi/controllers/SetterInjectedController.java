package hwt.springframework.hwtdi.controllers;

import hwt.springframework.hwtdi.services.GreetingService;

public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
