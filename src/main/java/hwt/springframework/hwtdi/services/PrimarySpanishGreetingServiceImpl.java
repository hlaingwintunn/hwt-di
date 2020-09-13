package hwt.springframework.hwtdi.services;

import hwt.springframework.hwtdi.repository.GreetingRepository;

public class PrimarySpanishGreetingServiceImpl implements GreetingService{

    public GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository repository) {
        this.greetingRepository = repository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}