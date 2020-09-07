package hwt.springframework.hwtdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SN", "default"})
@Service("i18nService")
public class I18NSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - Spanish";
    }
}
