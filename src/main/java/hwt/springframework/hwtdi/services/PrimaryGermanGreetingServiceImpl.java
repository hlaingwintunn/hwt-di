package hwt.springframework.hwtdi.services;

import hwt.springframework.hwtdi.repository.GreetingRepository;

public class PrimaryGermanGreetingServiceImpl implements GreetingService{

    public GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository repository) {
        this.greetingRepository = repository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
