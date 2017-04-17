package ru.emv.controllers;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.emv.message.EventMessage;
import ru.emv.message.MessageBuilder;

/**
 * Created by fruit on 05.04.2017.
 */
@RestController
public class ButtonsController {

    @Autowired
    MessageBuilder builder;

    @Autowired
    EventBus eventBus;

    @PostMapping("/btn1")
    public void btn1() {
        EventMessage massage = builder.setId(1)
                .setMessage("test_1")
                .build();
        eventBus.post(massage);
    }
}
