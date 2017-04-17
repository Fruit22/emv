package ru.emv;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.emv.kernel.Kernel;
import ru.emv.kernel.MessageEvent;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EmvApplication {

    @Autowired
    EventBus eventBus;


    public static void main(String[] args) {
        SpringApplication.run(EmvApplication.class, args);
    }

    //чисто пример для Максимильяна
    @PostConstruct
    private void init() {
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setMessage("hello");
        eventBus.post(messageEvent);
    }
}
