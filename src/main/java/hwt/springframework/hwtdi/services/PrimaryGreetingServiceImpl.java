package hwt.springframework.hwtdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From Primary Greeting";
    }
}
