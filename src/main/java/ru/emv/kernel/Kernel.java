package ru.emv.kernel;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;
import ru.emv.message.EventMessage;

@Component
public class Kernel{

    @Subscribe
    public void action(EventMessage messageEvent) {
        System.out.println("Получил сообщение:" + messageEvent);
    }
}
