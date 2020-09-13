package hwt.springframework.hwtdi.services;

import hwt.springframework.hwtdi.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGreetingServiceImpl implements GreetingService{

    public GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository repository) {
        this.greetingRepository = repository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
