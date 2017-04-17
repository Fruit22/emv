package ru.emv.kernel;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

@Component
public class Kernel{

    @Subscribe
    public void action(MessageEvent messageEvent) {
        System.out.println("Получил сообщение:" + messageEvent);
    }
}
