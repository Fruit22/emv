package ru.emv.controllers;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.emv.message.MessageBuilder;
import ru.emv.tester.KernelTester;
import ru.emv.tester.ReaderCommand;
import ru.emv.tests.ReaderCommandTest;

/**
 * Created by fruit on 05.04.2017.
 */
@RestController
public class ButtonsController {

    @Autowired
    MessageBuilder builder;

    @Autowired
    EventBus eventBus;

    @Autowired
    @Qualifier("java")
    private KernelTester kernelTester;

    @Autowired
    private ReaderCommandTest readerCommandTest;

    @PostMapping("readerCommands/actCommand")
    public ResponseEntity<String> sendActCommand() {
        readerCommandTest.testActCommand();
        String response =
        return ResponseEntity.ok(response);



//        EventMessage massage = builder.setId(1)
//                .setMessage("test_1")
//                .build();
//        eventBus.post(massage);
    }
}
